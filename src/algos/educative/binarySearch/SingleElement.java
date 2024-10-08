package algos.educative.binarySearch;

public class SingleElement {
    public static void main(String[] args) {
        singleNonDuplicate(new int[] {1,1,2,2,3,3,4,4,5,8,8});
    }

    public static int singleNonDuplicate(int[] nums) {

        // Replace this placeholder return statement with your code
        int left = 0;
        int right = nums.length - 1;
        while (left != right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 != 0) mid--;
            if (nums[mid] != nums[mid + 1]) right=mid;
            else left=mid+2;
        }
        return nums[left];
    }
}
