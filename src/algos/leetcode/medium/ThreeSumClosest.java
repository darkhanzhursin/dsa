package algos.leetcode.medium;

import java.util.Arrays;

public class ThreeSumClosest {

    public static void main(String[] args) {
        threeSumClosest(new int[] {-1,2,1,-4}, 1);
    }
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left, right, triple;
        int closest = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;
            while(left < right) {
                triple = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(triple - target);
                if (diff < closest) {
                    closest = diff;
                    ans = triple;
                }
                if (triple == target) return triple;
                if (triple > target) right--;
                else left++;
            }
        }
        return ans;
    }
}
