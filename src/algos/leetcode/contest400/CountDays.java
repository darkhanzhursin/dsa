package algos.leetcode.contest400;

import java.util.HashSet;
import java.util.Set;

public class CountDays {

    public static void main(String[] args) {
        countDays(5, new int[][]{{2, 4}, {1, 3}});
        String s = "abc";

    }

    static int countDays(int days, int[][] meetings) {
        Set<Integer> set = new HashSet<>();
        for (int[] meeting : meetings) {
            for (int i = meeting[0]; i <= meeting[1]; i++) {
                set.add(i);
            }
        }

        return days - set.size();
    }
}
