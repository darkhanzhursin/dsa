package algos.codesignal.intro;

public class BoxBlur {
    static int[][] solution(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] blurredImage = new int[rows - 2][cols - 2];

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                int sum = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        sum += image[k][l];
                    }
                }
                blurredImage[i - 1][j - 1] = sum / 9; // Dividing by 9 for the average
            }
        }

        return blurredImage;
    }

    public static void main(String[] args) {
        solution(new int[][] {{7, 4, 0, 1}, {5, 6, 2, 2}, {6, 10, 7, 8}, {1, 4, 2, 0}});
    }
}
