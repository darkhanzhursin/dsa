package algos.leetcode.medium;

import java.util.List;
import java.util.Stack;

public class OceanView {

    public static void main(String[] args) {
        findBuildings(new int[] {10,8,2,5,3});
    }

    static List<Integer> findBuildings(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            stack.push(i);
        }
        return stack.stream().toList();
    }
}
