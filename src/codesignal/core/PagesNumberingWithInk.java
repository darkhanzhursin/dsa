package codesignal.core;

public class PagesNumberingWithInk {

    public static void main(String[] args) {
        System.out.println(solution(9, 4));
    }

    static int solution(int current, int numberOfDigits) {
        int k = count(current);
        numberOfDigits -= k;
        while (numberOfDigits >= k) {
            current++;
            int s = count(current);
            if (s > k) k++;
            numberOfDigits -= k;
        }
        return current;
    }

    static int count(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
