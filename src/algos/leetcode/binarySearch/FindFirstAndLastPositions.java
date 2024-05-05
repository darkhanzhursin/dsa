package algos.leetcode.binarySearch;

public class FindFirstAndLastPositions {

    public static void main(String[] args) {
        searchRange(new int[] {5,7,7,8,8,10}, 8);
    }

    static int[] searchRange(int[] nums, int target) {
        int first = findFirstOccurance(nums, target);
        int last = findLastOccurance(nums, target);
        return new int[] {first, last};
    }

    private static int findLastOccurance(int[] nums, int target) {
         int low = -1;
         int high = nums.length;
         while (low + 1 < high) {
             int mid = low + (high - low) / 2;
             if (isGreaterOrEqual(nums[mid], target)) {
                 high = mid;
             } else {
                 low = mid;
             }
         }
         if (high == nums.length || nums[high] != target) {
             return -1;
         }
         return high;
    }

    private static boolean isGreaterOrEqual(int num, int target) {
        return num >= target;
    }



    private static int findFirstOccurance(int[] nums, int target) {
        int low = -1;
        int high = nums.length;
        while (low + 1 < high) {
            int mid = low + (high - low) / 2;
            if (isSmallerOrEqual(nums[mid], target)) {
                low = mid;
            } else {
                high = mid;
            }
        }
        if (low == -1 || nums[low] != target) {
            return -1;
        }
        return low;
    }

    private static boolean isSmallerOrEqual(int num, int target) {
        return num <= target;
    }


}
