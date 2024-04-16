package algos.leetcode;

public class ArrayRemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        removeElement(new int[] {3, 2, 2, 3, 3}, 3);
    }
}
