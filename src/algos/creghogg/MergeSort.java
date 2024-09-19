package algos.creghogg;

public class MergeSort {
    public static void main(String[] args) {
        int[] D = {-5, 3, 2, 1, -3, -3, 7, 2, 2};
        int[] sortedArray = mergeSort(D);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(sortedArray));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int mid = arr.length / 2;
        int[] left = java.util.Arrays.copyOfRange(arr, 0, mid);
        int[] right = java.util.Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, l = 0, r = 0;
        while (l < left.length && r < right.length) {
            result[i++] = (left[l] < right[r]) ? left[l++] : right[r++];
        }
        while (l < left.length) result[i++] = left[l++];
        while (r < right.length) result[i++] = right[r++];
        return result;
    }
}
