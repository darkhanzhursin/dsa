package algos.codesignal.intro;

import java.util.ArrayList;
import java.util.List;

public class MessageFromBinaryCode {
    public static void main(String[] args) {
        solution("010010000110010101101100011011000110111100100001");
    }
    static String solution(String code) {
        List<String> codes = usingSubstringMethod(code, 8);

        StringBuilder sb = new StringBuilder();
        for (String s : codes) {
            sb.append(convert(s));
        }

        return sb.toString();
    }

    static String convert(String binary) {

        String s = "";
        char nextChar = (char)Integer.parseInt(binary, 2);
        s += nextChar;
        return s;
    }

    static public List<String> usingSubstringMethod(String text, int n) {
        List<String> results = new ArrayList<>();
        int length = text.length();

        for (int i = 0; i < length; i += n) {
            results.add(text.substring(i, Math.min(length, i + n)));
        }

        return results;
    }

}
