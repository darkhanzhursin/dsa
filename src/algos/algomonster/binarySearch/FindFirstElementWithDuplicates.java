package algos.algomonster.binarySearch;

public class FindFirstElementWithDuplicates {
    public static void main(String[] args) {
        findFirst(new int[]{10, 11, 12, 13}, 10);
    }

    static int findFirst(int[] arr, int target) {
        int left = 0; // sol zhaq
        int right = arr.length - 1; // on zhaq
        int targetIndex = -1; // tappasaq -1 qaitaramyz
        while (left <= right) { // poka sol zhaq on zhaqtan kishi ne ten bolsa
            int mid = left + (right - left) / 2; // ortasyn tabamyz
            if (arr[mid] == target) { // ortangy el targetke ten bolsa
                targetIndex = mid; // target tabyldy, byraq birinshi ma?
                right = mid - 1; // on zhaq ortadan 1 el solqa qarai zhylzhydy
            } else if (arr[mid] < target) { // target ortadan ulken bolsa
                left = mid + 1; // ortadan solga qarai barin oshirip, sol zhaqty ortadan 1 el onga qarai zhylzytamyz
            } else { // bolmasa
                right = mid - 1; // ortadan onga qarai barin oshirip, on zhaqty ortadan 1 el solga qarai zhylzhytamyz
            }
        }
        return targetIndex;
    }
}
