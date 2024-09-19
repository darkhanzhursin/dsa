package algos.algomonster.binarySearch;

public class SearchInRoataedArrayII {

    public static void main(String[] args) {
        System.out.println(search2(new int[] {2, 2, 4, 5, 7, 0, 1}, 1));
    }

    static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return true;

            if (nums[left] == nums[mid]) {
                left++;
                continue;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) right = mid - 1;
                else left= mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return false;
    }

    static boolean search2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true;

            if (nums[start] <= nums[mid]) { // if mid number is more than start number
                if (nums[start] <= target && target < nums[mid]) end = mid - 1; // if start number less than target
                    // and target number less than mid number we remove half by pointing end before mid
                else start = mid + 1; // else point start after mid
            }
            else {
                if (nums[mid] < target && target <= nums[end]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return false;
    }
}
