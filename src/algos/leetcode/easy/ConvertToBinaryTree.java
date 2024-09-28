package algos.leetcode.easy;

public class ConvertToBinaryTree {

    public static void main(String[] args) {
        sortedArrayToBST(new int[] {-10,-3,0,5,9});
    }

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int left = 0;
        int right = nums.length - 1;
        return createTree(nums, left, right);
    }

    static private TreeNode createTree(int[] nums, int l, int r) {
        if (l > r) return null;
        int mid = l + (r - l) / 2; // 2                                         // 0
        TreeNode root = new TreeNode(nums[mid]);                        // -10
        root.left = createTree(nums, l, mid - 1); //nums, 0, -1      // null
        root.right = createTree(nums, mid + 1, r); // nums,
        return root;
    }
}
