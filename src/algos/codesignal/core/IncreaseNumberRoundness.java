package algos.codesignal.core;

public class IncreaseNumberRoundness {

    public static void main(String[] args) {
        solution(902200100);
    }

    static boolean solution(int n) {
        char[] chars = Integer.toString(n).toCharArray();
        for (int i = chars.length - 1; i >= 1; i--) {
            if (chars[i] != '0') {
                if (chars[i - 1] == '0') return true;
            }
        }
        return false;
    }
}
