package algos.miu.sorts.src.sortroutines;

import algos.miu.sorts.src.runtime.Sorter;

public class QuickSort extends Sorter {
    public static void main(String[] args) {
        int[] E = {1, 6, 2, 4, 3, 5};
        quickSort(E, 0, E.length - 1);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(E));
    }

    @Override
    public int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
