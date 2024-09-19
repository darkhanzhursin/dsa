package algos.creghogg;

public class SelectionSort {
    public static void main(String[] args) {
        int[] C = {-3, 3, 2, 1, -5, -3, 7, 2, 2};
        selectionSort(C);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(C));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
