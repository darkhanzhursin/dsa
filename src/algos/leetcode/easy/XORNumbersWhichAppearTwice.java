package algos.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class XORNumbersWhichAppearTwice {

    public static void main(String[] args) {
        duplicateNumbersXOR(new int[] {1,4,4});
    }

    static int duplicateNumbersXOR(int[] nums) {
//        int i = 0;
//        int j = nums.length - 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    list.add(nums[i]);
                }
            }
        }
        if (list.isEmpty()) return 0;
        if (list.size() == 1) return list.get(0);
        int res = 0;
        for (int k = 0; k < list.size() - 1; k++) {
            res = list.get(k) ^ list.get(k + 1);
        }
        return res;
    }
}
