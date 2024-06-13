package algos.educative.twoPointers;

public class ValidPalindromeII {

    public static void main(String[] args) {
        System.out.println(validPalindrome("raceacar"));
        System.out.println(validPalindrome("madam"));
    }

    static boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return compare(s, l+1, r) || compare(s, l, r-1);
            }
            l++;
            r--;
        }
        return true;
    }

    static private boolean compare(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) { return false;}
            l++;
            r--;
        }
        return true;
    }
}
