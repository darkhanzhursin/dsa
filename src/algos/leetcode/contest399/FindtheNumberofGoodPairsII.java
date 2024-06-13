package algos.leetcode.contest399;

public class FindtheNumberofGoodPairsII {
    public static void main(String[] args) {
        numberOfPairs(new int[] {1, 3, 4}, new int[] {1, 3, 4}, 1);
    }
    static long numberOfPairs(int[] nums1, int[] nums2, int k) {
        long res = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % nums2[j] * k == 0) {
                    res++;
                }
            }
        }

        return res;
    }
}
