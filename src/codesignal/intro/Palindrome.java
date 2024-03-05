package codesignal.intro;

public class Palindrome {
    static boolean solution(String inputString) {
        if (inputString.length() == 1) return true;
        String s = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            char c = inputString.charAt(i);
            s = s + c;
        }

        return s.equals(inputString);
    }

    public static void main(String[] args) {
        solution("abacaba");
    }
}
