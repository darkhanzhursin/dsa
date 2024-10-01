package algos.leetcode.medium;

public class NumbersOfSubarrays {

    public static void main(String[] args) {
        numberOfSubarrays(new int[] {1,1,2,1,1}, 3);
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] cnt = new int[n + 1]; // [0, 0, 0, 0, 0, 0]
        cnt[0] = 1; // [1, 3, 0, 0, 0, 0]
        int ans = 0, t = 0;
        for (int v : nums) {
            t += v & 1;

            if (t - k >= 0) {
                ans += cnt[t - k]; //1
            }
            cnt[t]++;
        }
        return ans;
    }
}
