package algos.miu.lab11;

import java.util.*;

public class DisconnectedGraphs {

    public static void main(String[] args) {
        List<List<Character>> graph = new ArrayList<>() {
            {
                add(new ArrayList<>(Arrays.asList('A', 'B')));
                add(new ArrayList<>(Arrays.asList('A', 'F')));
                add(new ArrayList<>(Arrays.asList('A', 'D')));
                add(new ArrayList<>(Arrays.asList('D', 'C')));
                add(new ArrayList<>(Arrays.asList('F', 'D')));
                add(new ArrayList<>(Arrays.asList('E', 'G')));
            }
        };

        DisconnectedGraphs disconnectedGraphs = new DisconnectedGraphs();

    }

    // DFS for disconnected graphs
    public void dfsForDisconnectedGraph(List<List<Character>> graph) {
        Map<Character, List<Character>> adjacencyList = getAdjacencyList(graph);
        Set<Character> visited = new HashSet<>();

        List<Character> result = new ArrayList<>();

        // Perform DFS from each node if not already visited
        for (Character node : adjacencyList.keySet()) {
            if (!visited.contains(node)) {
                dfs(node, adjacencyList, visited, result);
            }
        }

        System.out.println("DFS Traversal for Disconnected Graph: " + result);
    }

    // DFS using a stack (iterative implementation)
    private void dfsWithStack(Character startNode, Map<Character, List<Character>> adjacencyList, Set<Character> visited, List<Character> result) {
        Stack<Character> stack = new Stack<>();
        stack.push(startNode);
        visited.add(startNode);

        while (!stack.isEmpty()) {
            Character node = stack.pop();
            result.add(node);

            // Visit all unvisited neighbors
            for (Character neighbor : adjacencyList.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);  // Push unvisited neighbor onto the stack
                }
            }
        }
    }

    // Helper recursive DFS method
    private void dfs(Character node, Map<Character, List<Character>> adjacencyList, Set<Character> visited, List<Character> result) {
        visited.add(node);
        result.add(node);

        // Explore all unvisited neighbors
        for (Character neighbor : adjacencyList.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, adjacencyList, visited, result);
            }
        }
    }

    private Map<Character, List<Character>> getAdjacencyList(List<List<Character>> graph) {
        Map<Character, List<Character>> adjacencyList = new HashMap<>();

        for (List<Character> edge : graph) {
            Character char1 = edge.get(0);
            Character char2 = edge.get(1);
            adjacencyList.computeIfAbsent(char1, k -> new ArrayList<>()).add(char2);
            adjacencyList.computeIfAbsent(char2, k -> new ArrayList<>()).add(char1);
        }

        return adjacencyList;
    }
}
