package algos.codesignal.intro;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {
    static boolean solution(String inputString) {
        if (inputString.length() == 1) return true;

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {
        solution("aabb");
    }
}
