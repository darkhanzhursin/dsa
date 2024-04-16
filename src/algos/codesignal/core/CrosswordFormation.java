package algos.codesignal.core;

import java.util.ArrayList;
import java.util.List;

public class CrosswordFormation {
    public int solution(String[] words) {
        int result = 0;
        // loop word 1
        for (int a = 0; a < 4; a++) {
            String word_a = words[a];
            // loop word 2
            for (int b = 0; b < 4; b++) {
                if (b == a) continue;
                String word_b = words[b];
                List<int[]> occus = findAllOccu(word_a, word_b);
                for (int[] indexes : occus) {
                    int a_index = indexes[0];
                    int b_index = indexes[1];
                    // loop word 3
                    for (int c = 0; c < 4; c++) {
                        if (c == a || c == b) continue;
                        String word_c = words[c];
                        List<int[]> occ = findAllOccu(word_b, word_c);
                        for (int[] indexess : occ) {
                            int b_indexx = indexess[0];
                            int c_index = indexess[1];
                            int space_index = b_indexx - b_index;
                            if (space_index < 2) continue;
                            // loop word 4
                            for (int d = 0; d < 4; d++) {
                                if (d == a || d == b || d == c) continue;
                                String word_d = words[d];
                                result += countOccuIn3Words(word_a, word_c, a_index, c_index, word_d, space_index);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    List<int[]> findAllOccu(String word1, String word2) {
        List<int[]> res = new ArrayList<>();
        int word1_index = 0;
        for (char c : word1.toCharArray()) {
            List<Integer> occus = findOccu(word2, String.valueOf(c));
            for (Integer word2_index : occus) {
                res.add(new int[] {word1_index, word2_index});
            }
            word1_index++;
        }
        return res;
    }

    List<Integer> findOccu(String word, String match) {
        List<Integer> res = new ArrayList<>();
        for (int i = word.indexOf(match); i >= 0; i = word.indexOf(match, i + 1)) {
            res.add(i);
        }
        return res;
    }

    int countOccuIn3Words(String word1, String word2, int word1_index, int word2_index, String word3, int space_index) {
        int res = 0;
        int boundary = Math.min(word1.length() - (word1_index + 2), word2.length() - (word2_index + 2));

        for (int i = 0; i < word3.length() - space_index; i++) {
            for (int j = 0; j < boundary; j++) {
                char word1_char = word1.charAt(j + word1_index + 2);
                char word2_char = word2.charAt(j + word2_index + 2);
                char word3_char1 = word3.charAt(i);
                char word3_char2 = word3.charAt(i + space_index);
                if (word3_char1 == word1_char && word3_char2 == word2_char) {
                    res++;
                }
            }
        }
        return res;
    }
}
