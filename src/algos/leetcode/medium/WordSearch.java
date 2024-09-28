package algos.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {

    public static void main(String[] args) {
        exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED");
    }

    static boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();

        List<Character> list = new ArrayList<>();

        for (char c : chars) {
            list.add(c);
        }

        for (char[] row : board) {
            for (Character c : row) {
                if (list.contains(c)) {
                    list.remove(c);
                }
            }
        }

        return list.isEmpty();
    }
}
