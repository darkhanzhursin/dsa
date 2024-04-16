package algos.codesignal.core;

public class Rounders {
    public static void main(String[] args) {
        System.out.println(solution(1234));
    }

    static int solution(int n) {
        int powerOf10 = 1;

        while (n >= 10) {
            int lastDigit = n % 10;
            n /= 10;

            if (lastDigit >= 5)
                n++; // Increase the next significant digit by 1

            powerOf10 *= 10;
        }

        return n * powerOf10;
    }
}
