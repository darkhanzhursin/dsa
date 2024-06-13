package algos.leetcode.easy;

public class SumOfAllSubsetXOR {
    public static void main(String[] args) {
        subsetXORSum(new int[] {1, 3});
    }

    static int sum = 0;
    static int subsetXORSum(int[] nums) {
        dfs(nums, 0, sum);
        return sum;
    }

    // Depth-first search method to explore subsets and calculate XOR sums
    static void dfs(int[] nums, int start, int prevSum) {
        if(start >= nums.length) { // Base case: If the start index exceeds array length, return
            return;
        }

        for(int i = start; i < nums.length; i++) { // Iterate through the array from start index
            int currentSum = prevSum ^ nums[i]; // Calculate XOR value of current element with previous sum
            sum += currentSum; // Add current XOR sum to the total sum
            dfs(nums, i + 1, currentSum); // Recursively explore subsets with updated parameters
        }
    }
}
