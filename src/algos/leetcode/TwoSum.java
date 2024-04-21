package algos.leetcode;

import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        twoSum2(new int[] {-1,2,7,11,15}, 22);
    }

    static int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];
            if (total == target) {
                return new int[] {left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] {-1, -1};
    }

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    res[0] = i;
                    res[1] = k;
                }
            }
        }

        return res;
    }
}
