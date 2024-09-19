package algos.educative.slidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        findMaxSlidingWindow(new int[] {-4, 2, -5, 3, 6}, 3);
    }

    // function to clean up the window
    public static Deque<Integer> cleanUp(int i, Deque<Integer> currentWindow, int[] nums) {
        while (currentWindow.size() != 0 && nums[i] >= nums[currentWindow.getLast()]) {
            currentWindow.removeLast();
        }
        return currentWindow;
    }

    // function to find the maximum in all possible windows
    public static int[] findMaxSlidingWindow(int[] nums, int w) {
        if (nums.length == 1) {
            return nums;
        }
        int [] output = new int[nums.length - w + 1];
        Deque<Integer> currentWindow = new ArrayDeque<>();
        for (int i = 0; i < w; i++) {
            currentWindow = cleanUp(i, currentWindow, nums);
            currentWindow.add(i);
        }
        output[0] = nums[currentWindow.getFirst()];
        for (int i = w; i < nums.length; i++) {
            cleanUp(i, currentWindow, nums);
            if (!currentWindow.isEmpty() && currentWindow.getFirst() <= (i - w)) {
                currentWindow.removeFirst();
            }
            currentWindow.add(i);
            output[i - w + 1] = nums[currentWindow.getFirst()];
        }
        return output;
    }
}
