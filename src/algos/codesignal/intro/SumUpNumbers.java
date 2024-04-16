package algos.codesignal.intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumUpNumbers {
    public static void main(String[] args) {
        solution("2 apples, 12 oranges");
    }

    static int solution(String inputStr) {
        int sum = 0;
        String[] arr = inputStr.split("[^0-9]");

        for (String s : arr) {
            if (!s.isEmpty()) sum += Integer.parseInt(s);
        }
        System.out.println(sum);
        return sum;
    }

    public static String getOnlyDigits(String s) {
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(s);
        String number = matcher.replaceAll("");
        return number;
    }
}
