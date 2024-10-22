package algos.miu.lab9;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int rows = n + 1;
        int cols = m + 1;

        // Initializing the 2-D table
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dp[i][j] = -1;
            }
        }

        // Initializing the 1st row with 0s
        for (int j = 0; j < cols; j++) {
            dp[0][j] = 0;
        }

        // Initializing the 1st cols with 0s
        for (int i = 0; i < rows; i++) {
            dp[i][0] = 0;
        }

        // Iterating to fill the table
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                // If characters at this position match,
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // add 1 to the previous diagonal and store it in this diagonal
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // If the characters don't match, fill this entry with the max of the
                    // left and top elements
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }
}
