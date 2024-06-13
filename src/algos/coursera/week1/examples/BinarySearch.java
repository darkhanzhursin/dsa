package algos.coursera.week1.examples;

public class BinarySearch {
    static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (value < array[mid]) {
                high = mid - 1;
            } else if (value > array[mid]) {
                low = mid + 1;
            } else return mid;
        }
        return -1;
    }
}
