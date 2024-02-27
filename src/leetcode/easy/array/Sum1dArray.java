package leetcode.easy.array;

public class Sum1dArray {
    public static int[] runningSum(int[] nums) {
        int sum[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sum[i] = nums[i];
            } else {
                sum[i] = sum[i-1] + nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        runningSum(new int[] {1,2,3,4});
    }
}
