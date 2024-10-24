package algos.miu.lab11;

import java.util.*;

public class DfsAndBfs {

    public static void main(String[] args) {

        DfsAndBfs dfsAndBfs = new DfsAndBfs();

        List<List<Character>> graph = new ArrayList<>() {
            {
                add(new ArrayList<>(Arrays.asList('A', 'B')));
                add(new ArrayList<>(Arrays.asList('A', 'F')));
                add(new ArrayList<>(Arrays.asList('A', 'D')));
                add(new ArrayList<>(Arrays.asList('D', 'C')));
                add(new ArrayList<>(Arrays.asList('F', 'D')));
                add(new ArrayList<>(Arrays.asList('D', 'E')));
                add(new ArrayList<>(Arrays.asList('E', 'G')));
            }
        };
//        dfsAndBfs.dfsWithStack(graph);
//        dfsAndBfs.dfsRec(graph);

        dfsAndBfs.bfs(graph);

    }

    public void dfsRec(List<List<Character>> graph) {
        Map<Character, List<Character>> adjacencyList = getAdjacencyList(graph);
        Set<Character> visited = new HashSet<>();

        List<Character> result = new ArrayList<>();
        for (Character c : adjacencyList.keySet()) {
            if (!visited.contains(c)) {
                dfs(c, adjacencyList, visited, result);
            }
        }
        System.out.println(result);
    }

    private void dfs(char c, Map<Character, List<Character>> adjacencyList, Set<Character> visited,
                     List<Character> result) {
        visited.add(c);
        result.add(c);

        if (adjacencyList.containsKey(c)) {
            for (Character character : adjacencyList.get(c)) {
                if (!visited.contains(character)) {
                    dfs(character, adjacencyList, visited, result);
                }
            }
        }
    }

    public void dfsWithStack(List<List<Character>> graph) {
        Stack<Character> stack = new Stack();
        Map<Character, List<Character>> adjacencyList = getAdjacencyList(graph);
        Set<Character> visited = new HashSet<>();

        visited.add('A');

        stack.push('A');

        while (!stack.isEmpty()) {
            Character start = stack.pop();
            System.out.println(start);
            for (Character adjacency : adjacencyList.get(start)) {
                if (!visited.contains(adjacency)) {
                    visited.add(adjacency);
                    stack.push(adjacency);
                }
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

    public void bfs(List<List<Character>> graph) {
        Map<Character, List<Character>> adjacencyList = getAdjacencyList(graph);
        Set<Character> visited = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();

        visited.add('A');
        queue.offer('A');

        while (!queue.isEmpty()) {
            Character start = queue.poll();
            System.out.println(start);

            for (Character adjacency : adjacencyList.get(start)) {
                if (!visited.contains(adjacency)) {
                    visited.add(adjacency);
                    queue.offer(adjacency);
                }
            }
        }
    }
}
