package algos.educative.twoPointers;

public class RedWhitBlue {
    public static int[] sortColors(int[] colors) {

        int start = 0;
        int current = 0;
        int end = colors.length - 1;

        while (current <= end) {

            if (colors[current] == 0) {

                if (colors[start] != 0) {
                    int temp = colors[start];
                    colors[start] = colors[current];
                    colors[current] = temp;
                }

                current++;
                start++;
            }

            else if (colors[current] == 1) {
                current++;
            }

            else {
                if (colors[end] != 2) {
                    int temp = colors[current];
                    colors[current] = colors[end];
                    colors[end] = temp;
                }

                end--;
            }
        }

        return colors;
    }

    // Driver code
    public static void main(String[] args) {
        sortColors(new int[]{0, 1, 0, 2, 3});
    }
}
