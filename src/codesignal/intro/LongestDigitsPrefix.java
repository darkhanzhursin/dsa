package codesignal.intro;

import java.util.ArrayList;

public class LongestDigitsPrefix {
    static String solution(String inputString) {

        char[] charArr = inputString.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArr.length; i++) {
            if (!Character.isDigit(charArr[i])) {
                break;
            }  else {
                sb.append(charArr[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        solution("123aa1");
    }
}
