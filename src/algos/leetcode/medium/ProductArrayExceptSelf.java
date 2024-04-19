package algos.leetcode.medium;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {1, 2, 3, 4})));
    }

    static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        Arrays.fill(res, 1);
        int curr = 1;
        for(int i = 0; i < l; i++) {
            res[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = l - 1; i >= 0; i--) {
            res[i] *= curr;
            curr *= nums[i];
        }
        return res;

    }
}
