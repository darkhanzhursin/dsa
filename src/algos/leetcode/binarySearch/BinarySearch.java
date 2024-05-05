package algos.leetcode.binarySearch;

// https://leetcode.com/discuss/study-guide/2371234/An-opinionated-guide-to-binary-search-(comprehensive-resource-with-a-bulletproof-template)
public class BinarySearch {
    // Minimization - Find first occurrance of an element in a sorted array with duplicates.
    // Maximization - Find last occurrance of an element in a sorted array with duplicates.


    // minimize x such that condition(x) is true
    static int binarySearchMinX(int[] arr) {
        // decide what is the search space
        // hi should be able to take all possible values in the search space
        // lo points to an invalid value (the negative case of the if condition)
        int lo = -1;
        int hi = arr.length;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (condition(arr, mid)) hi = mid;
            else lo = mid;
        }
        // in minimization template, hi contains the return index
        return hi;
    }

    // maximize x such that condition(x) is true
    static int binarySearchMaxX(int[] arr) {
        // decide what is the search space
        // lo should be able to take all possible values in that search space
        // hi points to an invalid value (the negative case of the if condition)
        int lo = -1;
        int hi = arr.length;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (condition(arr, mid)) lo = mid;
            else hi = mid;
        }
        // in maximization template, lo contains the return index
        return hi;
    }

    private static boolean condition(int arr[], int index) {
        // some condition on arr[idx]
        // return true or false
        return true;
    }
}
