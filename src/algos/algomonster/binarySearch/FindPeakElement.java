package algos.algomonster.binarySearch;

public class FindPeakElement {

    public static void main(String[] args) {
        System.out.println(findPeak(new int[]{0, 1, 2, 3, 2, 1, 0}));
    }

    static int findPeak(int[] arr) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        int boundaryIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }
}
