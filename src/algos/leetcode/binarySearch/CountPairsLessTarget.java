package algos.leetcode.binarySearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountPairsLessTarget {

    public static void main(String[] args) {
        countPairs(new ArrayList<>(List.of(-6,2,5,-2,-7,-1,3)), -2);
    }

    static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int counter = 0;
        int low = 0;
        int high = nums.size() - 1;
//        for (int i = 0; i < nums.size() - 1; i++) {
//            for (int j = i + 1; j < nums.size(); j++) {
//                if (nums.get(i) + nums.get(j) < target) counter++;
//            }
//        }

        while (low < high) {
            if (nums.get(low) + nums.get(high) < target) {
                counter += high - low;
                low++;
            } else high--;
        }
        return counter;
    }
}
