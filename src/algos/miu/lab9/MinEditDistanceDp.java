package algos.miu.lab9;

import java.util.Arrays;

public class MinEditDistanceDp {

    public int minEditDistance(String word1, String word2) {
        // Declare a  lookup_table array which stores
        // the answer to recursive calls
        int[][] lookupTable = new int[word1.length()][word2.length()];
        for (int i = 0; i < word1.length(); i++) {
            Arrays.fill(lookupTable[i], -1);
        }

        return minEditDistRecursive(word1, word2, word1.length(), word2.length(), lookupTable);
    }

    private int minEditDistRecursive(String str1, String str2, int m, int n, int[][] lookupTable) {

        // If first string is empty, the only option is to
        // insert all characters of second string into first
        if (m == 0) return n;

        // If second string is empty, the only option is to
        // remove all characters of first string
        if (n == 0) return m;

        // If the recursive call has been called previously,
        // then return the stored value that was calculated previously
        if (lookupTable[m - 1][n - 1] != -1)
            return lookupTable[m - 1][n - 1];

        // If last characters of two strings are same, nothing much to do.
        // Ignore last characters and get count for remaining strings.

        // Store the returned value at lookup_table[m-1][n-1]
        // considering 1-based indexing
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            lookupTable[m - 1][n - 1] = minEditDistRecursive(str1, str2, m - 1, n - 1, lookupTable);
            return lookupTable[m - 1][n - 1];
        }


        // If last characters are not same, consider all three operations on last
        // character of first string, recursively compute minimum cost for all three operations
        // and take minimum of three values.

        // Store the returned value at lookup_table[m-1][n-1]
        // considering 1-based indexing
        lookupTable[m-1][n-1] = 1 + Math.min(
                Math.min(minEditDistRecursive(str1, str2, m, n - 1, lookupTable), // Insert
                        minEditDistRecursive(str2, str1, m - 1, n, lookupTable)), // Remove
                        minEditDistRecursive(str1, str2, m - 1, n - 1, lookupTable) // Replace
        );

        return lookupTable[m - 1][n - 1];
    }
}
