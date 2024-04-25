package algos.hackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(1, 2, 3));
        arr.add(List.of(4, 5, 6));
        arr.add(List.of(7, 8, 9));
        diagonalDifference(arr);
    }

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int d1 = 0;
        int d2 = 0;
        
        int n = arr.size();
        // int k = n - 1;
        for (int i = 0, k = n - 1; i < n; i++, k--) {  // row
            for (int j = 0; j < arr.get(i).size(); j++) { // column

                if (i == j) d1 += arr.get(i).get(j);

            }
            d2 += arr.get(i).get(k);
            // k--;
        }

        return Math.abs(d1 - d2);
    }
}

