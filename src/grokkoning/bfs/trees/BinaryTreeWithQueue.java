package grokkoning.bfs.trees;

// Iterative Queue based Java program
// to do level order traversal
// of Binary Tree

import java.util.LinkedList;
import java.util.Queue;

// Class to represent Tree node
class SimpleNode {
    int data;
    SimpleNode left, right;

    public SimpleNode(int item)
    {
        data = item;
        left = null;
        right = null;
    }
}

// Class to print Level Order Traversal
public class BinaryTreeWithQueue {
    SimpleNode root;

    // Given a binary tree. Print
    // its nodes in level order
    // using array for implementing queue
    void printLevelOrder() {
        Queue<SimpleNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            // poll() removes the present head.
            SimpleNode tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String args[]) {
        // Creating a binary tree and entering
        // the nodes
        BinaryTreeWithQueue tree_level = new BinaryTreeWithQueue();
        tree_level.root = new SimpleNode(1);
        tree_level.root.left = new SimpleNode(2);
        tree_level.root.right = new SimpleNode(3);
        tree_level.root.left.left = new SimpleNode(4);
        tree_level.root.left.right = new SimpleNode(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}
