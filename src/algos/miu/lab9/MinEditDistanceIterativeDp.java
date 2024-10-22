package algos.miu.lab9;

public class MinEditDistanceIterativeDp {

    private int minEditDistIterative(String str1, String str2, int m, int n) {
        // Create a table to store results of sub-problems
        int lookupTable[][] = new int[m + 1][n + 1];

        // Fill lookupTable [][] in bottom up manner

        // If second string is empty, only option is to
        // remove all characters of first string
        for (int i = 0; i <= m; i++) {
            lookupTable[i][0] = i; // Min. operations = i
        }

        // If first string is empty, only option is to
        // insert all characters of second string
        for (int j = 0; j <= n; j++) {
            lookupTable[0][j] = j; // Min. operations  = j
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If last characters are same, ignore last char
                // and recur for remaining string
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lookupTable[i][j] = lookupTable[i - 1][j - 1];
                }

                // If last characters are different, consider all
                // possibilities and find the minimum
                else {
                    lookupTable[i][j] = 1 + Math.min(
                            Math.min(lookupTable[i - 1][j], // Remove
                                    lookupTable[i][j - 1]), // Insert
                            lookupTable[i - 1][j - 1]); // Replace
                }
            }
        }

        return lookupTable[m][n];
    }

    public int minEditDistance(String str1, String str2) {
        return minEditDistIterative(str1, str2, str1.length(), str2.length());
    }

    public static void main(String[] args) {
        MinEditDistanceIterativeDp minEditDistanceIterativeDp = new MinEditDistanceIterativeDp();
        System.out.println(minEditDistanceIterativeDp.minEditDistance("sam", "samson"));
    }
}
