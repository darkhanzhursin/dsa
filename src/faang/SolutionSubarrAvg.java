package faang;

public class SolutionSubarrAvg {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double res = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            res = Math.max(res, sum);
        }
        return res / k;
    }

    public double findMaxAverageWithPrefixSum(int[] nums, int k) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

        double res = sums[k-1];
        for (int i = k; i < sums.length; i++) {
            res = Math.max(res, (sums[i] - sums[i - k]));
        }

        return res / k;
    }
}
