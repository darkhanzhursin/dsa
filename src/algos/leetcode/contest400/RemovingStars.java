package algos.leetcode.contest400;

import java.util.Stack;

public class RemovingStars {

    public static void main(String[] args) {
        clearStars("ade*");
    }

    static String clearStars(String s) {
        if (!s.contains("*")) return s;

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (!stack.isEmpty()) {
                    delete(stack);
                }
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    static void delete(Stack<Character> stack) {
        int index = 0;
        int temp = Integer.MAX_VALUE;
        for (int i = stack.size()-1; i >= 0; i--) {
            if (stack.get(i).hashCode() < temp) {
                index = i;
                temp = stack.get(i).hashCode();
            }
        }
        stack.remove(index);
    }
}
