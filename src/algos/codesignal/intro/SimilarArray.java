package algos.codesignal.intro;

import java.util.Arrays;

public class SimilarArray {
    static boolean solution(int[] a, int[] b) {
        // Count the number of elements that are not in the correct position
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        if (count > 2) return false;
        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Check if the sorted arrays are equal
        if (!Arrays.equals(a, b)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        solution(new int[] {832, 998, 148, 570, 533, 561, 894, 147, 455, 279},
                new int[] {832, 570, 148, 998, 533, 561, 455, 147, 894, 279});
    }
}
