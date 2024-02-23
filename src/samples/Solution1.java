package samples;

/*
    An array with an odd number of elements is said to be centered if all elements
    (except the middle one) are strictly greater than the value of the middle element.
    Note that only arrays with an odd number of elements have a middle element.
    Write a function that accepts an integer array and returns 1 if it is a centered array,
    otherwise it returns 0.
*/
public class Solution1 {
    public int isCentered(int[] nums) {
        if (nums.length == 0 || nums.length % 2 == 0)
            return 0;
        if (nums.length == 1)
            return 1;

        int middle = nums.length / 2;
        for (int i = 0; i < middle; i++) {
            if (nums[i] <= nums[middle]) {
                return 0;
            }
        }

        for (int i = middle + 1; i < nums.length; i++) {
            if (nums[i] <= nums[middle]) {
                return 0;
            }
        }
        return 1;
    }

    public int correctAnswer(int[] a)
    {
        if (a == null || a.length % 2 == 0) return 0;
        int midIndex = a.length / 2 ;
        int middleItem = a[midIndex];
        for (int i=0; i<a.length; i++)
        {
            if (i != midIndex && middleItem >= a[i])
                return 0;
        }
        return 1;
    }
}
