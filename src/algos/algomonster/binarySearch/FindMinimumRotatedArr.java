package algos.algomonster.binarySearch;

import java.util.Arrays;
import java.util.List;

public class FindMinimumRotatedArr {

    public static void main(String[] args) {
        System.out.println(findMinRotated(new int[] {3,1,2}));
    }

    static int findMinRotated(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int boundaryIndex = -1;
        int min = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= arr[right]) {
                boundaryIndex = mid;
                min = arr[boundaryIndex] < min ? arr[boundaryIndex] : min;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return min;
    }
}
