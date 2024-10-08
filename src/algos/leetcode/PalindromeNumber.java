package algos.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int x_1 = x;
        int temp = 0;
        while (x > 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        System.out.println(temp);
        return temp == x_1;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean res = palindromeNumber.isPalindrome(121);
        System.out.println(res);
    }
}
