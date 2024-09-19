package algos.creghogg;

public class InsertionSort {
    public static void main(String[] args) {
        int[] B = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
        insertionSort(B);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(B));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }
}
