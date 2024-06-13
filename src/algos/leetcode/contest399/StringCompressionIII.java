package algos.leetcode.contest399;
import java.util.Map;
import java.util.HashMap;

public class StringCompressionIII {
    public static void main(String[] args) {
        compressedString("rrbbqqqqqqqqqqqqqqqqqqqqqqqppggggggggggggggggggggg");
    }

    static String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int counter = 1;
        char prevChar = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            char curChar = word.charAt(i);
            if (prevChar == curChar) {
                counter++;
            } else {
                if (counter > 9) {
                    while (counter > 9) {
                        comp.append(9).append(prevChar);
                        counter -= 9;
                    }
                    comp.append(counter).append(prevChar);
                    prevChar = curChar;
                    counter = 1;
                    continue;
                }
                comp.append(counter).append(prevChar);
                prevChar = curChar;
                counter = 1;
            }
        }
        if (counter > 9) {
            while (counter > 9) {
                comp.append(9).append(prevChar);
                counter -= 9;
            }
            comp.append(counter).append(prevChar);
            return comp.toString();
        }
        comp.append(counter).append(prevChar);
        return comp.toString();
    }
}
