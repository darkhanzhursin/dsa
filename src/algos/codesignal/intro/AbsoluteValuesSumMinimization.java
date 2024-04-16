package algos.codesignal.intro;

public class AbsoluteValuesSumMinimization {

    static int solution(int[] a) {
        int minSum = Integer.MAX_VALUE;
        int result = 0;

        for (int x : a) {
            int sum = 0;
            for (int num : a) {
                sum += Math.abs(num - x);
            }

            if (sum < minSum || (sum == minSum && x < result)) {
                minSum = sum;
                result = x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        solution(new int[] {2, 4, 7});
    }
}
