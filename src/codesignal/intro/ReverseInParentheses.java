package codesignal.intro;

import java.util.Stack;

public class ReverseInParentheses {

    static String solution(String inputString) {
        int start = inputString.lastIndexOf('(');
        while (start != -1) {
            int end = inputString.indexOf(')', start);
            String reversedSubstring = reverseString(inputString.substring(start + 1, end));
            inputString = inputString.substring(0, start) + reversedSubstring + inputString.substring(end + 1);
            start = inputString.lastIndexOf('(');
        }
        return inputString;
    }

//    private static String reverseParentheses(String input) {
//        int start = input.lastIndexOf('(');
//        while (start != -1) {
//            int end = input.indexOf(')', start);
//            String reversedSubstring = reverseString(input.substring(start + 1, end));
//            input = input.substring(0, start) + reversedSubstring + input.substring(end + 1);
//            start = input.lastIndexOf('(');
//        }
//        return input;
//    }

    // Helper function to reverse a string
    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        solution("foo(bar(baz))blim");
    }
}
