package algos.leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdMaxArr {

    public static void main(String[] args) {
        thirdMax(new int[]{3, 2, 1});
    }

    static int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            if (!list.contains(n)) list.add(n);
        }

        if (list.size() >= 3) {
            return list.get(list.size() - 3);
        }

        return list.get(list.size() - 1);
    }
}
