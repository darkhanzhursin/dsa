package algos.codesignal.intro;

import java.util.ArrayList;
import java.util.List;

public class SpiralNumbers {
    public static void main(String[] args) {
        solution(3);
        spiralOrder(new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}});
    }

    static int[][] solution(int n) {
        int[][] res = new int[n][n];
        int counter = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                res[top][i] = counter++;
            }
            top++;

            // Fill rightmost column
            for (int i = top; i <= bottom; i++) {
                res[i][right] = counter++;
            }
            right--;

            // Fill bottom row
            for (int i = right; i >= left; i--) {
                res[bottom][i] = counter++;
            }
            bottom--;

            // Fill leftmost column
            for (int i = bottom; i >= top; i--) {
                res[i][left] = counter++;
            }
            left++;
        }

        return res;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (bottom >= top && right >= left) {

            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }


        return res;
    }
}
