package algos.miu.sorts.src.sortroutines;

import algos.miu.sorts.src.runtime.Sorter;

public class CountingSort extends Sorter {
    public static void main(String[] args) {
        int[] F = {13, 1, 2};
        countingSort(F);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(F));
    }

    public static void countingSort(int[] arr) {
        int n = arr.length;
        int max = java.util.Arrays.stream(arr).max().getAsInt(); //O(n + n + n
        int[] counts = new int[max + 1];
        for (int num : arr) {
            counts[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) { // n
            while (counts[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    @Override
    public int[] sort(int[] arr) { // [123, 1, 3]
        int n = arr.length;
        int max = java.util.Arrays.stream(arr).max().getAsInt(); //3
        int[] counts = new int[max + 1]; // [0, 0, 0, 0]
        for (int num : arr) {
            counts[num]++; // [0, 1, 1, 1]
        }
        int index = 0;
        for (int i = 0; i <= max; i++) { // 1
            while (counts[i]-- > 0) { //
                arr[index++] = i; // [1, 2, 3]
            }
        }
        return arr;
    }
}
