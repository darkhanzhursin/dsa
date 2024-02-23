package codesignals;

public class SumOfMatrix {
    static int solution(int[][] matrix) {
        int totalSum = 0;

        for (int col = 0; col < matrix[0].length; col++) {
            boolean skipColumn = false;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 0) {
                    skipColumn = true;
                }
                if (!skipColumn) {
                    totalSum += matrix[row][col];
                }
            }
        }
        System.out.println(totalSum);
        return totalSum;
    }

    public static void main(String[] args) {
        solution(new int[][] {{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}});
    }
}
