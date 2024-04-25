package algos.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    static List<String> parentheses;
    static Stack<Character> chars;

    static List<String> generateParenthesis(int n) {
        parentheses = new ArrayList<>();
        chars = new Stack<>();
        pHelper(n, 0, 0);
        return parentheses;
    }

    private static void pHelper(int n, int oc, int cc) {
        if (oc == n && cc == n) {
            StringBuilder t = new StringBuilder();
            for (char c : chars) t.append(c);
            parentheses.add(t.toString());
        }

        if (oc < n) {
            chars.push('(');
            pHelper(n, oc + 1, cc);
            chars.pop();
        }
        if (cc < oc) {
            chars.push(')');
            pHelper(n, oc, cc + 1);
            chars.pop();
        }
    }

    public static void main(String[] args) {
        generateParenthesis(2);
    }
}
