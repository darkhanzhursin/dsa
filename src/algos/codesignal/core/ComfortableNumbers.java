package algos.codesignal.core;

public class ComfortableNumbers {
    public static void main(String[] args) {
        System.out.println("Count: " + solution(1, 9));
    }
    static int solution(int l, int r) {
        int count = 0;
        for(int a = l; a <= r; a++)
            for(int b = a + 1; b <= r; b++)
                if(comf(a, b) && comf(b, a)){
                    System.out.println(a + " " + b);
                    count++;
                }
        return count;
    }
    static boolean comf(int a, int b){
        return a - sumOfDigits(a) <= b && b <= a + sumOfDigits(a);
    }

    static int sumOfDigits(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
