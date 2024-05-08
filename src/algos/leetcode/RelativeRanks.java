package algos.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public static void main(String[] args) {
        findRelativeRanks(new int[] {2, 1});
    }

    static String[] findRelativeRanks(int[] score) {
        int len = score.length;
        HashMap<Integer, String> map = new HashMap<>();
        int rank = 4;
        String[] result = new String[len];
        if (len == 1) {
            result[0] = "Gold Medal";
            return result;
        }

        if (len == 2) {
            if (score[0] > score[1]) {
                result[0] = "Gold Medal";
                result[1] = "Silver Medal";
            } else {
                result[0] = "Silver Medal";
                result[1] = "Gold Medal";
            }
            return result;
        }

        int[] a = Arrays.copyOf(score, len);
        Arrays.sort(a);

        map.put(a[len - 1], "Gold Medal");
        map.put(a[len - 2], "Silver Medal");
        map.put(a[len - 3], "Bronze Medal");

        for (int i = len - 4; i >= 0; i--) {
            if (!map.containsKey(i)) map.put(a[i], String.valueOf(rank++));
        }

        for (int i = 0; i < len; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }
}
