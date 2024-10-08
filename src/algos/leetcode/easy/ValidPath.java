package algos.leetcode.easy;

import java.util.*;

public class ValidPath {

    public static void main(String[] args) {
        // 1. DFS
        bfs(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, 0, 2);
    }

    static boolean isValidPathDFS(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;

        // Create an adjacency list representation of the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // Initialize an array to keep track of visited vertices
        int[] visited = new int[n];
        // Call the helper function to find a path from source to destination
        return dfs(source, destination, graph, visited);
    }

    // Function to perform depth-first search to find a path from source to destination
    private static boolean dfs(int source, int destination, List<List<Integer>> graph, int[] visited) {
        // If source and destination are the same, a path is found
        if (source == destination) return true;

        // Mark the current node as visited
        visited[source] = 1;

        // Traverse through all adjacent vertices of the current vertex
        for (int neighbor : graph.get(source)) {
            // If the neighbor is not visited, recursively search for a path
            if (visited[neighbor] == 0) {
                if (dfs(neighbor, destination, graph, visited))
                    return true; // If a path is found, return true
            }
        }

        return false;
    }

    public static boolean bfs(int n, int[][] edges, int source, int destination) {
        // Create an adjacency list representation of the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // Initialize a queue for BFS traversal and a visited array
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[n];
        visited[source] = 1;
        queue.add(source);

        // Perform BFS traversal
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == destination)
                return true;  // Destination reached

            // Visit all neighbors of the current vertex
            for (int neighbor : graph.get(current)) {
                if (visited[neighbor] == 0) {
                    visited[neighbor] = 1;
                    queue.add(neighbor);
                }
            }
        }

        return false;  // Destination not reached, no valid path exists
    }
}
