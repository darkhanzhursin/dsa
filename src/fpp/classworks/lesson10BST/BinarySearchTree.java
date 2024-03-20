package fpp.classworks.lesson10BST;

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree(int val) {
        root = new TreeNode(val);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return val + " ";
        }
    }

    public TreeNode seacrh(TreeNode node, int target) {
        if (node == null) {
            return null;
        } else if (node.val == target) {
            return node;
        }
        if (target < node.val) return seacrh(node.left, target);
        return seacrh(node.right, target);
    }

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            insertRec(root, val);
        }
    }

    private TreeNode insertRec(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (node.val < val) {
            node.right = insertRec(node.right, val);
        } else {
            node.left = insertRec(node.left, val);
        }
        return node;
    }

    public void inOrderTraverse(TreeNode node) {
        if (node != null) {
            inOrderTraverse(node.left);
            System.out.print(node.val + " ");
            inOrderTraverse(node.right);
        }
    }

    public void preOrderTraverse(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);
        }
    }

    public void postOrderTraverse(TreeNode node) {
        if (node != null) {
            postOrderTraverse(node.left);
            postOrderTraverse(node.right);
            System.out.print(node.val + " ");
        }
    }

    public TreeNode deleteNode(TreeNode node, int key) {
        // return null if root is null
        if (node == null) return node;

        // delete current node if root is the target node
        if (node.val == key) {
//            if (node.left == null && node.right == null) {
//
//            }
            // replace root with root -> right if root -> left is null
            if (node.left == null) return node.right;

            // replace root with root -> left if root -> right is null
            if (node.right == null) return node.left;

            // replace root with its successor if root has two children
            TreeNode p = findSuccessor(node);
            node.val = p.val;
            node.right = deleteNode(node.right, p.val);
            return node;
        }

        if (node.val < key) {
            // find target in right subtree if root -> val < key
            node.right = deleteNode(node.right, key);
        } else {
            // find target in left subtree if root -> val > key
            node.left = deleteNode(node.left, key);
        }
        return node;
    }

    private TreeNode findSuccessor(TreeNode node) {
        TreeNode cur = node.right;
        while (cur != null && cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root.val +
                '}';
    }
}
