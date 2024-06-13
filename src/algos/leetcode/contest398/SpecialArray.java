package algos.leetcode.contest398;

public class SpecialArray {
    public static void main(String[] args) {
        isArraySpecial(new int[] {3,4,1,2,6}, new int[][] {{0, 3}});
    }

    static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] sames = new int[n];
        for (int i = 1; i < n; ++i) {
            sames[i] = sames[i-1];
            if (nums[i]%2==nums[i-1]%2)
                sames[i]++;
        }
        boolean[] ans = new boolean[queries.length];
        for (int q = 0; q < queries.length; ++q) {
            if (sames[queries[q][1]]==sames[queries[q][0]])
                ans[q] = true;
        }
        return ans;
    }
}
