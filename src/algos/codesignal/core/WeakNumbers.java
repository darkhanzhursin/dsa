package algos.codesignal.core;

public class WeakNumbers {

    public static void main(String[] args) {
        solution(9);
    }

    static int[] solution(int n) {
        int maxWeakness = 0;
        int countMaxWeakness = 0;
        int[] divisors = new int[n + 1];

        // Calculate number of divisors for each number in the range [1, n]
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                divisors[j]++;
            }
        }

        // Calculate weakness for each number and find max weakness
        for (int i = 1; i <= n; i++) {
            int weakness = 0;
            for (int j = 1; j < i; j++) {
                if (divisors[j] > divisors[i]) {
                    weakness++;
                }
            }
            if (weakness > maxWeakness) {
                maxWeakness = weakness;
                countMaxWeakness = 1;
            } else if (weakness == maxWeakness) {
                countMaxWeakness++;
            }
        }

        return new int[] {maxWeakness, countMaxWeakness};
    }
}
