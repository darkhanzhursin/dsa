package algos.creghogg;

public class CountingSort {
    public static void main(String[] args) {
        int[] F = {5, 3, 2, 1, 3, 3, 7, 2, 2};
        countingSort(F);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(F));
    }

    public static void countingSort(int[] arr) {
        int n = arr.length;
        int max = java.util.Arrays.stream(arr).max().getAsInt();
        int[] counts = new int[max + 1];
        for (int num : arr) {
            counts[num]++;
        }
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (counts[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }
}
