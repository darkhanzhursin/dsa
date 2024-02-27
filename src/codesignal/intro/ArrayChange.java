package codesignal.intro;

public class ArrayChange {
    static int solution(int[] inputArray) {
        int counter = 0;
        for (int i = 0; i < inputArray.length-1; i++) {
            while (!(inputArray[i+1] > inputArray[i])) {
                counter++;
                inputArray[i+1]++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        solution(new int[] {1, 1, 1});
    }
}
