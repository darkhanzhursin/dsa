package algos.leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStackExamples {

    public static void main(String[] args) {
        findNextPreviousSmallerIndexes(new int[] {13, 8, 1, 5, 2, 5, 9, 7, 6, 12});
    }

    static int[] findNextGreaterIndexes(int[] arr) {
        if (arr.length == 0) return new int[]{0};
        if (arr.length == 1) return new int[]{arr[0]};

        Stack<Integer> stack = new Stack<>();

        int[] myArr = new int[arr.length];
    //    Arrays.fill(myArr, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                int top = stack.pop();
                myArr[top] = i;
            }
            stack.push(i);
        }

        // Remaining elements in stack don't have a next greater element
        while (!stack.isEmpty()) {
            myArr[stack.pop()] = -1;
        }
        return myArr;
    }

    static int[] findPreviousGreaterIndexes(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int[] previousGreaterArr = new int[arr.length];
        Arrays.fill(previousGreaterArr, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!stack.empty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            if (!stack.empty()) {
                previousGreaterArr[i] = stack.peek();
            }
            stack.push(i);
        }

        return previousGreaterArr;
    }

     static int[][] findNextAndPreviousGreaterIndexes(int[] arr) {
        // initialize an empty stack
        Stack<Integer> stack = new Stack<>();

        // initialize previousGreater and nextGreater arrays
        int[] previousGreater = new int[arr.length];
        int[] nextGreater = new int[arr.length];
        Arrays.fill(previousGreater, -1);
        Arrays.fill(nextGreater, -1);

        // iterate through all the elements of the array
        for (int i = 0; i < arr.length; i++) {
            // while loop runs until the stack is not empty AND
            // the element represented by stack top is SMALLER OR EQUAL to the current element
            // This means, the stack will always be strictly decreasing (type 3)
            // because elements are popped when they are equal, so equal elements will never stay in the stack
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                // pop out the top of the stack, it represents the index of the item
                int stackTop = stack.pop();

                // decides the next greater element for the index popped out from stack
                nextGreater[stackTop] = i;
            }

            // after the while loop, only the elements which are greater than the current element are left in stack
            // this means we can confidently decide the previous greater element of the current element i, that's stack top
            if (!stack.isEmpty()) {
                previousGreater[i] = stack.peek();
            }

            // push the current element
            stack.push(i);
        }

        return new int[][] { previousGreater, nextGreater };
    }

    static int[] findNextSmallerIndexes(int[] arr) {
        // initialize an empty stack
        Stack<Integer> stack = new Stack<>();

        // initialize nextSmaller array, this array holds the output
        // initialize all the elements to -1 (invalid value)
        int[] nextSmaller = new int[arr.length];
        Arrays.fill(nextSmaller, -1);

        // iterate through all the elements of the array
        for (int i = 0; i < arr.length; i++) {
            // while loop runs until the stack is not empty AND
            // the element represented by stack top is STRICTLY LARGER than the current element
            // This means, the stack will always be monotonic non-decreasing (type 2)
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                // pop out the top of the stack, it represents the index of the item
                int stackTop = stack.pop();

                // as given in the condition of the while loop above,
                // nextSmaller element of stackTop is the element at index i
                nextSmaller[stackTop] = i;
            }

            // push the current element
            stack.push(i);
        }

        return nextSmaller;
    }

    static int[] findPreviousSmallerIndexesStrictly(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] previousSmaller = new int[arr.length];
        Arrays.fill(previousSmaller, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) previousSmaller[i] = stack.peek();
            stack.push(i);
        }
        return previousSmaller;
    }

    static int[][] findNextPreviousSmallerIndexes(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int[] previousSmaller = new int[arr.length];
        int[] nextSmaller = new int[arr.length];
        Arrays.fill(previousSmaller, -1);
        Arrays.fill(nextSmaller, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int top = stack.pop();
                nextSmaller[top] = i;
            }

            if (!stack.isEmpty()) previousSmaller[i] = stack.peek();
            stack.push(i);
        }

        return new int[][] { previousSmaller,  nextSmaller};
    }

}
