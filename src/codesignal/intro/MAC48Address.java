package codesignal.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAC48Address {

    public static void main(String[] args) {
        System.out.println(solution("02-03-04-05-06-07-"));
    }

    static boolean solution(String input) {
        if (input.length() != 17) return false;
        List<Character> hexDigits = new ArrayList<>(
                List.of('0', '1', '2', '3', '4', '5', '6',
                        '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'));

        String[] splittedArr = input.split("-");
        if (splittedArr.length != 6) return false;

        StringBuilder sb = new StringBuilder();
        for (String str : splittedArr) {
            sb.append(str);
        }
        char[] chars = sb.toString().toCharArray();
        for (char c : chars) {
            if (!hexDigits.contains(c)) return false;
        }
        return true;
    }
}
