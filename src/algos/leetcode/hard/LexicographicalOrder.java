package algos.leetcode.hard;

public class LexicographicalOrder {

    public static void main(String[] args) {
        findKthNumber(13, 2);
    }

    public static int findKthNumber(int n, int k) {
        long num = 1;
        for (int i = 1; i < k;) {
            int req = getReqNum(num, num + 1, n);
            if (i + req <= k) {
                i += req;
                num++;
            } else {
                i++;
                num *= 10;
            }
        }

        return (int) num;
    }

    private static int getReqNum(long a, long b, long n) {
        int gap = 0;
        while (a <= n) {
            gap += Math.min(n + 1, b) - a;
            a *= 10;
            b *= 10;
        }

        return gap;
    }
}
