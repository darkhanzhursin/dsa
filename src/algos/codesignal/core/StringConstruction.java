package algos.codesignal.core;

import java.util.HashMap;
import java.util.Map;

public class StringConstruction {

    public static void main(String[] args) {
        solution("abc", "abccba");
    }

    static int solution(String a, String b) {
        Map<Character, Integer> countsA = new HashMap<>();
        Map<Character, Integer> countsB = new HashMap<>();

        // Count occurrences of characters in strings a and b
        for (char c : a.toCharArray()) {
            countsA.put(c, countsA.getOrDefault(c, 0) + 1);
        }
        for (char c : b.toCharArray()) {
            countsB.put(c, countsB.getOrDefault(c, 0) + 1);
        }

        int minOccurrences = Integer.MAX_VALUE;
        // Find the minimum number of occurrences of any character in a compared to b
        for (char c : countsA.keySet()) {
            int countInA = countsA.get(c);
            int countInB = countsB.getOrDefault(c, 0);
            if (countInB == 0) {
                return 0; // If character in a is not available in b, return 0 valid strings
            }
            minOccurrences = Math.min(minOccurrences, countInB / countInA);
        }

        return minOccurrences;
    }

}
