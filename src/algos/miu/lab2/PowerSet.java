package algos.miu.lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        powerSet(list);
        powerSet(new int[] {1, 2, 3});
    }

    public static List<Set<Integer>> powerSet(List<Integer> X) {
        List<Set<Integer>> P = new ArrayList<>();
        Set<Integer> S = new HashSet<>();
        P.add(S);
        while (!X.isEmpty()) {
            int f = X.remove(0);

            List<Set<Integer>> newSubsets = new ArrayList<>();

            for (Set<Integer> subset : P) {
                Set<Integer> T = new HashSet<>(subset);
                T.add(f);
                newSubsets.add(T);
            }

            P.addAll(newSubsets);
        }

        return P;
    }

    public static List<List<Integer>> powerSet(int[] nums) {
        return powerSetRec(new ArrayList<>(), new ArrayList<>(), nums, 0);
    }

    private static List<List<Integer>> powerSetRec(List<List<Integer>> ret, List<Integer> subset,
                                                   int[] nums, int i) {
        // base case
        if (i == nums.length) {
            ret.add(new ArrayList<>(subset));
            return ret;
        }

        powerSetRec(ret, subset, nums, i + 1);
        subset.add(nums[i]);
        powerSetRec(ret, subset, nums, i + 1);
        subset.remove(subset.size() - 1); //backtracking - clean up - maintain the status
        return ret;
    }
}
