package codesignal.intro;

public class DigitDegree {
    static int solution(int n) {
        int degree = 0;

        while (n >= 10) {
            int sum = 0;
            // Calculate the sum of digits
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            // Update n with the sum
            n = sum;
            degree++;
        }

        return degree;
    }

    public static void main(String[] args) {
        solution(100);
    }
}
