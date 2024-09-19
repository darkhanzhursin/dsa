package algos.educative.graph;

import java.util.*;

public class GraphValidTree {

    public static void main(String[] args) {
        validTree(4, new int[][] {{0, 1}, {0, 2}, {0, 3}});
    }

//    static class Node {
//        int value;
//        List<Node> neighbors;
//
//        public Node(int value) {
//            this.value = value;
//            this.neighbors = new ArrayList<>();
//        }
//    }

    static boolean validTree(int n, int[][] edges) {
        if ((n - 1) != edges.length) return false;
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacency.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            adjacency.get(x).add(y);
            adjacency.get(y).add(x);
        }

        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        visited.add(0);
        stack.push(0);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int neighbor : adjacency.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }

        return visited.size() == n;
    }


}
