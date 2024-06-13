package algos.educative.twoPointers;

import java.util.Arrays;

public class SumOfThreeValues {

    public static void main(String[] args) {
        findSumOfThree(new int[] {3,7,1,2,8,4,5}, 21);
    }

    public static boolean findSumOfThree(int[] nums, int target) {
        if (nums.length == 3 && nums[0] + nums[1] + nums[2] != target) {
            return false;
        }
        int low, high, triples;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            low = i + 1;
            high = nums.length - 1;

            while (low < high) {
                triples = nums[i] + nums[low] + nums[high];

                if (triples == target) {
                    return true;
                }
                else if (triples < target) {
                    low++;
                }
                else {
                    high--;
                }
            }
        }

        return false;
    }
}
