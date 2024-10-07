package algos.miu.sorts.src.sortroutines;

import algos.miu.sorts.src.runtime.Sorter;

public class MergeSortPlus extends Sorter {
    int[] theArray;
    InsertionSort insertionSort = new InsertionSort();

    public static void main(String[] args) {
        MergeSortPlus msPlus = new MergeSortPlus();
        msPlus.sort(new int[] {4, 1, 25, 10});
    }

    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        theArray = arr;
        mergeSort(temp, 0, n - 1);
        return theArray;
    }

    private void mergeSort(int[] temp, int l, int r) {
        // Use insertion sort for sub-arrays of size 20 or less
        if (r - l <= 20) {
            insertionSort.sort(theArray, l, r);
            return;
        }

        int mid = l + (r - l) / 2;
        mergeSort(temp, l, mid);
        mergeSort(temp, mid + 1, r);
        merge(temp, l, mid + 1, r);
    }

    private void merge(int[] temp, int l, int midPlusOne, int r) {
        int pos = 0;
        int i = l;
        int j = midPlusOne;
        int n = r - l + 1;

        while (i < midPlusOne && j <= r) {
            if (theArray[i] <= theArray[j]) {
                temp[pos++] = theArray[i++];
            } else {
                temp[pos++] = theArray[j++];
            }
        }

        while (i < midPlusOne) {
            temp[pos++] = theArray[i++];
        }

        while (j <= r) {
            temp[pos++] = theArray[j++];
        }

        for (j = 0; j < n; j++) {
            theArray[l + j] = temp[j];
        }
    }
}
