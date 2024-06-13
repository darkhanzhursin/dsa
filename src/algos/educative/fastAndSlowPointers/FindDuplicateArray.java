package algos.educative.fastAndSlowPointers;

public class FindDuplicateArray {

    public static void main(String[] args) {
        findDuplicate(new int[] {2, 5, 6, 8, 3, 9, 8, 1, 7, 4});
    }

    static int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];

        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(fast == slow) {
                break;
            }
        }

        slow = nums[0];

        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
