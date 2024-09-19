package algos.educative.slidingWindow;

public class MinSubsequence {

    public static void main(String[] args) {
        minWindow("abcdebdde", "bde");
    }

    static String minWindow(String str1, String str2) {

        int sizeStr1 = str1.length();
        int sizeStr2 = str2.length();

        float minSubLen = Float.POSITIVE_INFINITY;

        int indexS1 = 0;
        int indexS2 = 0;
        int start = 0, end = 0;
        String minSubsequence = "";

        while (indexS1 < sizeStr1) {
            if (str1.charAt(indexS1) == str2.charAt(indexS2)) {
                indexS2++;
                if (indexS2 == sizeStr2) {
                    start = indexS1;
                    end = indexS1;

                    indexS2--;
                    while (indexS2 >= 0) {
                        if (str1.charAt(start) == str2.charAt(indexS2)) {
                            indexS2--;
                        }

                        start--;
                    }

                    start++;
                    if ((end - start + 1) < minSubLen) {
                        minSubLen = end - start + 1;
                        minSubsequence = str1.substring(start, end + 1);
                    }
                    indexS1 = start;
                    indexS2 = 0;
                }
            }
            indexS1++;
        }
        return minSubsequence;
    }
}
