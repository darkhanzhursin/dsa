package codesignal.intro;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1,2,3,4,5,6,7,8,9},
                {4,5,6,7,8,9,1,2,3},
                {7,8,9,1,2,3,4,5,6},
                {2,3,4,5,6,7,8,9,1},
                {3,4,5,6,7,8,9,1,2},
                {5,6,7,8,9,1,2,3,4},
                {6,7,8,9,1,2,3,4,5},
                {8,9,1,2,3,4,5,6,7},
                {9,1,2,3,4,5,6,7,8}
        };
        System.out.println(solution(matrix));
    }

    static boolean solution(int[][] grid) {
        Set<Integer> sudoku = new HashSet<>();

        // check for each column
        for (int c = 0; c < grid[0].length; c++) {
            for (int r = 0; r < grid.length; r++) {
                sudoku.add(grid[r][c]);
            }
            if (sudoku.size() < 9) return false;
            sudoku.clear();
        }

        // check for each row
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sudoku.add(grid[i][j]);
            }
            if (sudoku.size() < 9) return false;
            sudoku.clear();
        }

        // check for each 3x3 block
        for (int i = 0; i < grid.length; i+=3) {
            for (int j = 0; j < grid[0].length; j+=3) {
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        sudoku.add(grid[r][c]);
                    }
                }
                if (sudoku.size() < 9) return false;
                sudoku.clear();
            }
        }
        return true;
    }
}
