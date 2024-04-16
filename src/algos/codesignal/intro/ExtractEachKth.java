package algos.codesignal.intro;

import java.util.ArrayList;

public class ExtractEachKth {

    static int[] solution(int[] inputArray, int k) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            if ((i + 1) % k != 0) {
                result.add(inputArray[i]);
            }
        }

        // Convert ArrayList to int array
        int[] outputArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            outputArray[i] = result.get(i);
        }

        return outputArray;
    }


    public static void main(String[] args) {
        solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3);
    }
}
