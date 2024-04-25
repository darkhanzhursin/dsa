package algos.leetcode;

public class HappyNumber {
    public static void main(String[] args) {
        isHappy(12);
    }

    static boolean isHappy(int n) {
        if (n == 1) return true;
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int square(int num) {
        int ans = 0;

        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }

        return ans;
    }
}
