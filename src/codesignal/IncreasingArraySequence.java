package codesignal;

public class IncreasingArraySequence {

    public static boolean solution(int[] sequence) {
        int count = 0; // Count of elements to remove

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                count++;
                if (count > 1) {
                    return false; // More than one element needs to be removed
                }
                if (i > 1 && i < sequence.length - 1 && sequence[i - 2] >= sequence[i] && sequence[i + 1] <= sequence[i - 1]) {
                    return false; // Two elements cannot be removed to fix the sequence
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        solution(new int[] {1, 2, 1, 2});
    }
}
