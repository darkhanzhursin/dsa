package algos.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class UncommonWord {

    public static void main(String[] args) {

    }

    public String[] uncommonFromSentences(String s1, String s2) {
        if (s1.equals(s2)) return new String[] {};
        String[] sen1 = s1.split(" ");
        String[] sen2 = s2.split(" ");

        Map<String, Integer> wordMap = new HashMap<>();
        for (String s : sen1) {
            wordMap.put(s, wordMap.getOrDefault(s, 0) + 1);
        }

        for (String s : sen2) {
            wordMap.put(s, wordMap.getOrDefault(s, 0) + 1);
        }

        //List<String> list = new ArrayList<>();
        int counter = 0;
        for (String s : wordMap.keySet()) {
            if (wordMap.get(s) == 1) {
                counter++;
            }
        }

        String[] res = new String[counter];
        int i = 0;
        for (String s : wordMap.keySet()) {
            if (wordMap.get(s) == 1) {
                res[i] = s;
                i++;
            }
        }

        return res;
    }
}
