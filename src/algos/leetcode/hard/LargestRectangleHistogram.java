package algos.leetcode.hard;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleHistogram {

    public static void main(String[] args) {
        largestRectangleArea(new int[] {2,1,5,6,2,3});
    }
    static int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] nextSmaller = new int[len];
        int[] prevSmaller = new int[len];
        Arrays.fill(nextSmaller, len);
        Arrays.fill(prevSmaller, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int top = stack.pop();
                nextSmaller[top] = i;
            }

            if (!stack.isEmpty()) prevSmaller[i] = stack.peek();
            stack.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < len; i++) {
            int currentHeight = heights[i];
            int width = nextSmaller[i] - prevSmaller[i] - 1;
            maxArea = Math.max(maxArea, currentHeight * width);
        }

        return maxArea;
    }
}
