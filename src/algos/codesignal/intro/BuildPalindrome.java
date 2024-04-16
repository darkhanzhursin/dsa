package algos.codesignal.intro;

public class BuildPalindrome {
    public static void main(String[] args) {
        System.out.println(solution("abc")); // abc => abcba
    }

    static String solution(String st) {
        if (st.length() == 1 || isPalindrome(st)) return st;
        int pos = 0;
        String newStr = "";
        boolean flag = isPalindrome(st);
        while (!flag) {
            newStr = createNewString(st, pos);
            flag = isPalindrome(newStr);
            pos++;
        }
        return newStr;
    }

    static String createNewString(String st, int pos) {
        String ending = st.substring(0, pos);
        StringBuilder reverse = new StringBuilder(ending).reverse();
        ending = reverse.toString();
        st = st + ending;
        return st;
    }

    // Method to check if a string is a palindrome
    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Second option
    static boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
}
