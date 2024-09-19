package algos.algomonster.tree;

/*
A perfect binary tree has the following properties:

Number of nodes in a perfect binary tree is 2^n-1 where n is the number of levels. Calculation: The first level has 1
 node, the root. The next level has 2 nodes. The following levels have 4, 8, 16.. nodes. This is a geometric sequence
 and the sum is a(1-r^n)/(1-r). Plug in a = 1 and r = 2 and we get 2^n-1.
Number of internal nodes = number of leaf nodes - 1. Calculation: A perfect binary tree of height n+1 will have 2^n
leaf nodes. The internal nodes in the tree of height n+1 form a perfect binary tree of height n with 2^n-1 total
nodes. Comparing the two values, we see that # of internal nodes = # leaf nodes - 1.
Total number of nodes = 2 * number of leaf nodes - 1. This is a derivative of property #2 and the fact that the total
 number of nodes = number of leaf nodes + number of internal nodes. So the number of total nodes and leaf nodes are both O(2^n)

 */

public class BinaryTree<T> {
    public T val;
    public BinaryTree<T> left;
    public BinaryTree<T> right;

    public BinaryTree(T val) {
        this(val, null, null);
    }

    public BinaryTree(T val, BinaryTree<T> left, BinaryTree<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void inOrderTraversal(BinaryTree<Integer> root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void preOrderTraversal(BinaryTree<Integer> root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(BinaryTree<Integer> root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.val);
        }
    }
}
