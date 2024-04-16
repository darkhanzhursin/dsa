package algos.codesignal.intro;

import java.util.Arrays;

public class ArrayMaxConsecutiveSum {
    static int solution(int[] inputArray, int k) {
        if (k > inputArray.length) return 0;
        if (k == 1) {
            Arrays.sort(inputArray);
            return inputArray[inputArray.length-1];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= inputArray.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += inputArray[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 3, 5, 1, 6}, 3));
    }
}
