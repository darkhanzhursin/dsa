package algos.leetcode.medium;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

public class GoodNodes {

    public static void main(String[] args) {
        GoodNodes goodNodes = new GoodNodes();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        root.left.left = new TreeNode(3);

        goodNodes.goodNodes(root);
    }

    int counter;
    public int goodNodes(TreeNode root) {
        counter = 1;
        count(root.val, root.left);
        count(root.val, root.right);

        return counter; // 1 +
    }

    void count(int max, TreeNode next) {
        if (next == null) return;
        if (next.val >= max) {
            counter = counter + 1;
            max = Math.max(next.val, max);
            count(max, next.right);
            count(max, next.left);
        }
        else {
            count(max, next.right);
            count(max, next.left);
        }
    }
}
