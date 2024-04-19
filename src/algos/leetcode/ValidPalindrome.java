package algos.leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.toLowerCase().split(", | |: |\\.");
        for (String str : arr) {
            sb.append(str);
        }
        String res = sb.toString();
        return res.equals(sb.reverse().toString());
    }

    static boolean solution(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = isPalindrome("a.");
        System.out.println(res);
    }
}
