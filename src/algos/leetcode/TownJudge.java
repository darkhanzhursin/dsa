package algos.leetcode;

public class TownJudge {
    public static int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n + 1];
        int[] trustedByCount = new int[n + 1];

        // Count trust relationships
        for (int[] pair : trust) {
            int a = pair[0];
            int b = pair[1];
            trustCount[a]++;
            trustedByCount[b]++;
        }

        // Find the person who trusts no one and is trusted by everyone else
        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == 0 && trustedByCount[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        findJudge(4, new int[][] {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}});
    }
}
