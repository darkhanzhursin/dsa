package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicationArray {
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!res.contains(nums[i])) {
                System.out.println(nums[i]);
                res.add(nums[i]);
            }
        }
        return res.size();
    }

    public static void main(String[] args) {
        removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});

    }
}
