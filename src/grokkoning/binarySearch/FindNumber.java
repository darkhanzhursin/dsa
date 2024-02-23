package grokkoning.binarySearch;

public class FindNumber {
    public static int findNum(int[] nums, int item) {
        int low = 0;
        int high = nums.length-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int guess = nums[mid];
            if (guess == item) return mid;
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        findNum(new int[] {1,3,5,6}, 2);
    }
}
