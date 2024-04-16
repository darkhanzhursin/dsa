package algos.codesignal.intro;

import java.util.Arrays;

public class Obstacles {
    static int solution(int[] inputArray) {
        Arrays.sort(inputArray);
        int max = inputArray[inputArray.length - 1];
        for (int i = 1; i <= max + 1; i++) {
            boolean canJump = true;
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[j] % i == 0) {
                    canJump = false;
                    break;
                }
            }
            if (canJump) {
                return i;
            }
        }
        return -1; // In case no solution found
    }

    public static void main(String[] args) {
        solution(new int[] {1, 4, 10, 6, 2});
    }
}
