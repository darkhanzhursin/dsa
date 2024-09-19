package algos.educative.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

    public static void main(String[] args) {
        int[][] data = new int[][]{{2, 3}, {1, 3}, {1, 2}};
        Node root = createGraph(data);
        cloneGraph(root);
    }

    static class Node {
        int data;
        List<Node> neighbors;

        public Node(int data) {
            this.data = data;
            neighbors = new ArrayList<>();
        }
    }

    static Node cloneGraph(Node root) {
        Map<Node, Node> map = new HashMap<>();
        return cloneHelper(root, map);
    }

    private static Node cloneHelper(Node root, Map<Node, Node> nodesCompleted) {
        if (root == null) {
            return null;
        }

        Node clonedNode = new Node(root.data);
        nodesCompleted.put(root, clonedNode);

        for (Node neighbor : root.neighbors) {
            Node cloned = nodesCompleted.get(neighbor);
            if (cloned == null) {
                clonedNode.neighbors.add(cloneHelper(cloned, nodesCompleted));
            } else {
                clonedNode.neighbors.add(cloned);
            }
        }
        return clonedNode;
    }

    private static Node createGraph(int[][] data) {
        if(data.length == 0){
            return new Node(1);
        }
        Node[] nodes = new Node[data.length];
        for (int i = 0; i < data.length; i++) {
            nodes[i] = new Node(i + 1);
        }

        for (int i = 0; i < data.length; i++) {
            for (int neighbor : data[i]) {
                nodes[i].neighbors.add(nodes[neighbor - 1]);
            }
        }
        return nodes[0];
    }
}
