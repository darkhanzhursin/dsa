package algos.miu.lab1;

public class MergeTwoArrays {
    public static void main(String[] args) {
        merge(new int[] {1, 4, 5, 8, 17}, new int[] {2, 4, 8, 11, 13, 21, 23, 25});
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m + n];

        int k = m + n - 1;
        while (k >= 0) {
            if (m == 0) {
                result[k--] = arr2[n-1];
                n--;
                //k--;
                continue;
            }
            if (n == 0) {
                result[k--] = arr1[m-1];
                m--;
                //k--;
                continue;
            }
            if (arr1[m-1] > arr2[n-1]) {
                result[k--] = arr1[m-1];
                m--;
            } else {
                result[k--] = arr2[n - 1];
                n--;
            }
            //k--;
        }

        return result;
    }
}
