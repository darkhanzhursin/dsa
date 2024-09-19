package algos.educative.binarySearch;

public class SearchInRotatedArrII {
    public static void main(String[] args) {
        search(new int[] {1,3,1,1,1}, 3);
    }

    static boolean search(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == t) return true;

            if (arr[mid] == arr[left]) {
                left++;
                continue;
            }

            if (arr[left] <= arr[mid]) {
                if (arr[left] <= t && t <= arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[right] >= t && t >= arr[mid]) left = mid + 1;
                else right = mid - 1;
            }

        }

        return false;
    }
}


