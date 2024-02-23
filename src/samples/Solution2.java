package samples;

/*
* Write a function that takes an array of integers as an argument and returns a value based on
* the sums of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array
* and let Y = the sum of the even numbers. The function should return X – Y
* */
public class Solution2 {

    public int getDiffOfSum(int[] nums) {
        int sumOfEvens = 0;
        int sumOfOdds = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sumOfEvens += nums[i];
            } else {
                sumOfOdds += nums[i];
            }
        }

        return sumOfOdds - sumOfEvens;
    }
}
