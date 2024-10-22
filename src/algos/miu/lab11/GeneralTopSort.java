package algos.miu.lab11;

import java.util.*;

public class GeneralTopSort {

    public List<Character> sort(List<List<Character>> dependencies) {

        // created adjacency list
        Map<Character, List<Character>> adjacencyMap = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();

        // Build the graph and in-degree map
        for (List<Character> dependency : dependencies) {
            char predecessor = dependency.get(1);
            char successor = dependency.get(0);

            // Add to adjacency list
            adjacencyMap.computeIfAbsent(predecessor, k -> new ArrayList<>()).add(successor);

            // Increment in-degree of successor
            inDegree.put(successor, inDegree.getOrDefault(successor, 0) + 1);

            // Ensure predecessor is also in in-degree map (it might have 0 in-degree)
            inDegree.putIfAbsent(predecessor, 0);
        }

        // Step 2: Find the first source node (node with in-degree 0)
        Character firstSource = null;
        for (Map.Entry<Character, Integer> entry : inDegree.entrySet()) {
            if (entry.getValue() == 0) {
                firstSource = entry.getKey();
                break;
            }
        }

        if (firstSource != null) {
            System.out.println("First source node (no in-vertices): " + firstSource);
        } else {
            System.out.println("No source node found.");
        }

        // Step 3: Perform DFS on each unvisited node
        Set<Character> visited = new HashSet<>();
        Stack<Character> stack = new Stack<>();

        // Perform DFS for each node
        for (char node : inDegree.keySet()) {
            if (!visited.contains(node)) {
                dfs(node, adjacencyMap, visited, stack);
            }
        }

        // Step 4: Collect the sorted order from the stack
        List<Character> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        System.out.println(result);
        return result;
    }

    // Helper method to perform DFS
    private void dfs(char node, Map<Character, List<Character>> adjacencyList, Set<Character> visited, Stack<Character> stack) {
        visited.add(node);

        if (adjacencyList.containsKey(node)) {
            for (char neighbor : adjacencyList.get(node)) {
                if (!visited.contains(neighbor)) {
                    dfs(neighbor, adjacencyList, visited, stack);
                }
            }
        }

        stack.push(node);
    }

    public boolean isReachableFrom(List<List<Character>> dependencies, char start, char end) {
        Map<Character, List<Character>> adjacencyMap = new HashMap<>();
        for (List<Character> dependency : dependencies) {
            char predecessor = dependency.get(1);
            char successor = dependency.get(0);
            adjacencyMap.computeIfAbsent(predecessor, k -> new ArrayList<>()).add(successor);
        }

        Set<Character> visited = new HashSet<>();
        return reachableDfs(start, end, visited, adjacencyMap);
    }

    private boolean reachableDfs(char start, char end, Set<Character> visited, Map<Character, List<Character>> adjacencyMap) {
        if (start == end) return true;

        visited.add(start);

        List<Character> neighbors = adjacencyMap.getOrDefault(start, new ArrayList<>());
        for (char neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                if (reachableDfs(neighbor, end, visited, adjacencyMap)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<List<Character>> dependencies = new ArrayList<>() {
            {
                add(new ArrayList<>(Arrays.asList('B', 'A')));
                add(new ArrayList<>(Arrays.asList('C', 'B')));
                add(new ArrayList<>(Arrays.asList('D', 'B')));
                add(new ArrayList<>(Arrays.asList('E', 'B')));
                add(new ArrayList<>(Arrays.asList('E', 'C')));
                add(new ArrayList<>(Arrays.asList('E', 'D')));
                add(new ArrayList<>(Arrays.asList('D', 'G')));
                add(new ArrayList<>(Arrays.asList('F', 'E')));
            }
        };

        GeneralTopSort topSort = new GeneralTopSort();
        topSort.sort(dependencies);

        System.out.println(topSort.isReachableFrom(dependencies, 'A', 'F'));
        System.out.println(topSort.isReachableFrom(dependencies, 'A', 'G'));
    }


}
