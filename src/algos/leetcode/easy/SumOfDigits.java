package algos.leetcode.easy;

public class SumOfDigits {

    public static void main(String[] args) {
        getLucky("leetcode", 2);
    }

    public static int getLucky(String s, int k) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            int pos = Character.toLowerCase(c) - 'a' + 1;
            sum += pos;
        }

        if (k == 1) return sum;

        int summ = 0;
        while (k > 1) {
            while (sum != 0) {
                int temp = sum % 10;
                sum /= 10;
                summ += temp;
            }
            k--;
        }

        return summ;
    }
}
