package algos.leetcode.medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        longestConsecutive(new int[] {100,4,200,1,3,2});
    }

    public static int longestConsecutive(int[] nums) {
        int len = nums.length;
        if (len == 0 || len == 1) return len;
        Arrays.sort(nums);
        int counter = 1;
        int temp = 0;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i + 1] - nums[i] == 0) continue;
            if (nums[i + 1] - nums[i] == 1) counter++;
            else {
                temp = Math.max(counter, temp);
                counter = 1;
            }
        }

        counter = Math.max(counter, temp);
        return counter;
    }
}
