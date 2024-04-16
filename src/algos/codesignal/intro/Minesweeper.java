package algos.codesignal.intro;

/**
 * This is a javadoc for class
 * @author Darkhan Zhursin
 * */
public class Minesweeper {

    /**
     *
     * @param matrix 2d boolean array
     * @return 2d int array
     */
    static int[][] solution(boolean[][] matrix) {
        int start = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ans = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (matrix[row][col]) {
                    ans[row][col] = -1;
                    //break;
                }

                int rowStart = Math.max(row - 1, start);
                int rowFinish = Math.min(row + 1, rows - 1);
                int colStart = Math.max(col - 1, start);
                int colFinish = Math.min(col+1, cols - 1);
                for (int curRow = rowStart; curRow <= rowFinish; curRow++) {
                    for (int curCol = colStart; curCol <= colFinish; curCol++) {
                        if (matrix[curRow][curCol]) {
                            ans[row][col]++;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        solution(new boolean[][] {  {true, false},
                                    {false, true}
        });
    }
}
