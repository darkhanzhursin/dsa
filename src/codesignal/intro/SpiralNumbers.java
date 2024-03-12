package codesignal.intro;

public class SpiralNumbers {
    public static void main(String[] args) {
        solution(3);
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
}
