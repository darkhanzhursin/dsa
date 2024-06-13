package algos.leetcode.hard;

public class FindMaxSumNodeVals {

    public static void main(String[] args) {
        maximumValueSum(new int[] {24,78,1,97,44}, 6, new int[][]{{0,2}, {1,2}, {4,2}, {3,4}});
    }

    static long maximumValueSum(int[] nums, int k, int[][] edges) {

        long total = 0;
        for (int num : nums) {
            total += num;
        }

        long totalDiff = 0;
        long diff;
        int positiveCount = 0;
        long minAbsDiff = Long.MAX_VALUE;

        for (int num : nums) {
            diff = (num ^ k) - num;

            if (diff > 0) {
                totalDiff += diff;
                positiveCount++;
            }
            minAbsDiff = Math.min(minAbsDiff, Math.abs(diff));
        }

        if (positiveCount % 2 == 1) {
            totalDiff -= minAbsDiff;
        }
        return total + totalDiff;

    }
}
