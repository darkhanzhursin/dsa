package algos.miu.lab8;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    public static void main(String[] args) {
        subsetSum(new int[] {1, 2, 5, 4}, 6);
    }

    static List<List<Integer>> subsetSum(int[] nums, int target) {
        return backtrack(new ArrayList<>(), new ArrayList<>(), nums,0, target);
    }

    private static List<List<Integer>> backtrack(List<List<Integer>> ret, List<Integer> subset, int[] nums, int i,
                                                 int target) {
        if (i == nums.length) {
            if (sum(subset) == target) {
                ret.add(new ArrayList<>(subset));
            }
            return ret;
        }

        backtrack(ret, subset, nums, i + 1, target);
        subset.add(nums[i]);
        backtrack(ret, subset, nums, i + 1, target);
        subset.remove(subset.size() - 1);
        return ret;
    }

    private static int sum(List<Integer> subset) {
        int sum = 0;
        for (Integer num : subset) {
            sum += num;
        }
        return sum;
    }
}
