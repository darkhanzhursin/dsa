package algos.educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        int res = longestRepeatingCharacterReplacement("aabccbb", 2);
        System.out.println(res);
    }

    public static int longestRepeatingCharacterReplacement(String s, int k) {
        int start = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        int mostFreqChar = 0;
        int lenOfMaxSub = 0;
        for(int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            freqMap.put(s.charAt(end), freqMap.getOrDefault(s.charAt(end), 0) + 1);
            mostFreqChar = Math.max(mostFreqChar, freqMap.get(current));

            if (end - start + 1 - mostFreqChar > k) {
                freqMap.put(s.charAt(start), freqMap.get(s.charAt(start)) - 1);
                start++;
            }

            lenOfMaxSub = Math.max(lenOfMaxSub, end - start + 1);
        }
        return lenOfMaxSub;
    }
}
