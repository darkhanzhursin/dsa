package algos.creghogg;

// Time: O(n^2)
// Space: O(1)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[] {-5, 3, 2};
        bubbleSort(arr);
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
//        boolean flag = true;
//        while (flag) {
//            flag = false;
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        return arr;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return arr;
    }
}
