package algos.miu.lab8;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<List<Integer>> res = permute(new int[]{1, 2, 3});
        System.out.println(res);
    }

    private static List<List<Integer>> permute(int[] nums) {
        return backtrack(new ArrayList<>(), new ArrayList<>(), nums);
    }

    private static List<List<Integer>> backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return res;
        }
        for (int num : nums) {
            if (temp.contains(num)) {
                continue;
            }
            temp.add(num);
            backtrack(res, temp, nums);
            temp.remove(temp.size() - 1);
        }

        return res;
    }
}
