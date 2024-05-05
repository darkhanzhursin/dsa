package algos.leetcode.binarySearch;

public class FirstBadVersion {
    public static void main(String[] args) {
        firstBadVersion(5);
    }
    static int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while (low + 1 < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) high = mid;
            else low = mid;
        }
        return high;
    }

    static boolean isBadVersion(int n) {
        return n > 3;
    }
}
