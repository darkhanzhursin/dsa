package algos.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        subsets(new int[] { 1, 2, 3 });
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> curr = new ArrayList<>();
        backtrack(nums, 0, curr, res);

        return res;
    }

    private static void backtrack(int[] nums, int index, List<Integer> curr,
                                  List<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        backtrack(nums, index + 1, curr, res);

        curr.add(nums[index]);

        backtrack(nums, index + 1, curr, res);

        curr.remove(curr.size() - 1);
    }
}
