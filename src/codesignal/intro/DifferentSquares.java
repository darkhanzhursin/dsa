package codesignal.intro;

import java.util.HashSet;
import java.util.Set;

public class DifferentSquares {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(solution(matrix));
    }

    static int solution(int[][] matrix) {
        if (matrix.length < 2) return 0;
        if (matrix[0].length < 2) return 0;

        Set<String> squares = new HashSet<>();
        for (int r = 0; r < matrix.length - 1; r++) { // rows
            for (int c = 0; c < matrix[r].length - 1; c++) { //columns
                String square = matrix[r][c] + matrix[r][c + 1] + matrix[r][c + 1] +
                                matrix[r + 1][c] + matrix[r + 1][c + 1] + "";
                squares.add(square);
            }
        }
        return squares.size();
    }

}
