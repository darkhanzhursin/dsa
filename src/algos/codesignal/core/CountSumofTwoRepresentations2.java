package algos.codesignal.core;

public class CountSumofTwoRepresentations2 {
    public static void main(String[] args) {
        solution(6, 2, 4);
    }

    static int solution(int n, int l, int r) {
        int counter = 0;
        for (int A = l; A <= r; A++) {
            int B = n - A;
            if (B >= A && B <= r) {
                counter++;
            }
        }
        return counter;
    }
}
