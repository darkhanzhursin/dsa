package algos.leetcode.medium;

import java.util.HashSet;
import java.util.Set;
public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
    static boolean isValidSudoku(char[][] board) {
        Set<Character> sudoku = new HashSet<>();
        int count = 0;
        // check for each column
        for (int c = 0; c < board[0].length; c++) {
            for (int r = 0; r < board.length; r++) {
                char point = board[r][c];
                if (point == '.') continue;
                sudoku.add(point);
                count++;
            }
            if (sudoku.size() < count) return false;
            sudoku.clear();
            count = 0;
        }

        // check for each row
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char point = board[i][j];
                if (point == '.') continue;
                sudoku.add(point);
                count++;
            }
            if (sudoku.size() < count) return false;
            sudoku.clear();
            count = 0;
        }

        // check for each 3x3 block
        for (int i = 0; i < board.length; i+=3) {
            for (int j = 0; j < board[0].length; j+=3) {
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        char point = board[r][c];
                        if (point == '.') continue;
                        sudoku.add(point);
                        count++;
                    }
                }
                if (sudoku.size() < count) return false;
                sudoku.clear();
                count = 0;
            }
        }
        return true;
    }
}
