package algos.miu.lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetSum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(8);
        list.add(5);
        subsetSum(list, 21);
    }

    public static List<Integer> subsetSum(List<Integer> list, int k) {
        List<Set<Integer>> powerSet = generatePowerSet(list);

        for (Set<Integer> subSet : powerSet) {
            if(subsetSum(subSet) == k) {
                return new ArrayList<>(subSet);
            }
        }

        return null;
    }

    private static List<Set<Integer>> generatePowerSet(List<Integer> nums) {
        List<Set<Integer>> powerSet = new ArrayList<>();
        powerSet.add(new HashSet<>()); // empty

        // generate all subsets
        for (int num : nums) {
            List<Set<Integer>> newSubsets = new ArrayList<>();
            for (Set<Integer> subset : powerSet) {
                Set<Integer> newSubset = new HashSet<>(subset);
                newSubset.add(num);
                newSubsets.add(newSubset);
            }
            powerSet.addAll(newSubsets);
        }

        return powerSet;
    }

    private static int subsetSum(Set<Integer> subset) {
        int sum = 0;
        for (int num : subset) {
            sum += num;
        }

        return sum;
    }
}
