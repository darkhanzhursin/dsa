package algos.leetcode.medium;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class DailyTemp {
    public static void main(String[] args) {
        dailyTemperaturesWithStack(new int[] {73,74,75,71,69,72,76,73});
    }

    static int[] dailyTemperatures(int[] tempArr) {
        int l = tempArr.length;
        int[] arr = new int[l];
        int counter = 0;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (tempArr[j] > tempArr[i]) {
                    arr[i] = ++counter;
                    break;
                }
                if (tempArr[j] <= tempArr[i]) {
                    counter++;
                }
            }
            counter = 0;
        }
        arr[l-1] = 0;
        return arr;
    }

    static int[] dailyTemperaturesWithStack(int[] tempArr) {
        int l = tempArr.length;
        int[] arr = new int[l];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < l; i++) {
            while (!stack.isEmpty() && tempArr[stack.peek()] < tempArr[i]) {
                arr[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return arr;
    }
}
