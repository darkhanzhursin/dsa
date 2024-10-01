package algos.leetcode.medium;

import java.util.HashMap;

public class SubarraySumK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;

        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }

        for (int start = 0; start < sum.length; start++) {
            for (int end = start + 1; end < sum.length; end++) {
                if (sum[end] - sum[start] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int subarraySumMap(int[] nums, int k) {
        int counter = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k))
                counter += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return counter;
    }
}
