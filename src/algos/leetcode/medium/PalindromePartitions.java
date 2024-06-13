package algos.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitions {
    public static void main(String[] args) {
        // partitionWithBacktrack("aab");
        partitionWithDP("aab");
    }

    // Backtracking
    static List<List<String>> partitionWithBacktrack(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, int start, List<String> path, List<List<String>> result) {
        // If we've reached the end of the string, add the current partition to the result list
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        // Explore all possible partitions
        for (int end = start + 1; end <= s.length(); end++) {
            // If the current substring is a palindrome, add it to the current path
            if (isPalindrome(s, start, end - 1)) {
                path.add(s.substring(start, end));
                // Recur to find other partitions
                backtrack(s, end, path, result);
                // Backtrack to explore other partitions
                path.remove(path.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int left, int right) {
        // Check if the substring s[left:right+1] is a palindrome
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }


    // Dynamic Programming
    private static List<List<String>> partitionWithDP(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        // Initialize the DP table for single characters and pairs
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j) && (length == 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                }
            }
        }

        List<List<String>> result = new ArrayList<>();
        backtrackDP(s, 0, new ArrayList<>(), result, dp);
        return result;
    }

    private static void backtrackDP(String s, int start, List<String> path, List<List<String>> result, boolean[][] dp) {
        // If we've reached the end of the string, add the current partition to the result list
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        // Explore all possible partitions
        for (int end = start; end < s.length(); end++) {
            // Use the DP table to check if the substring s[start:end+1] is a palindrome
            if (dp[start][end]) {
                path.add(s.substring(start, end + 1));
                // Recur to find other partitions
                backtrackDP(s, end + 1, path, result, dp);
                // Backtrack to explore other partitions
                path.remove(path.size() - 1);
            }
        }
    }
}
