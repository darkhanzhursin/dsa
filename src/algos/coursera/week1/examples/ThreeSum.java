package algos.coursera.week1.examples;

public class ThreeSum {
    public static void main(String[] args) {

    }

    static int bruteForce(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }


}
