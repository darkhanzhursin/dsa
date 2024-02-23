package samples;

public class Solution6 {

    public int f(int[] nums) {
        if (nums.length < 3) return -1;
        int i = 0;
        int j = nums.length - 1;
        int idx = 1;
        int leftSum = nums[i];
        int rightSum = nums[j];
        for (int k = 1; k < nums.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += nums[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += nums[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum) {
            return idx;
        } else {
            return -1;
        }
    }
}
