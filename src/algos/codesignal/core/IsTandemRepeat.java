package algos.codesignal.core;

public class IsTandemRepeat {

    public static void main(String[] args) {
        solution("ab");
    }

    static boolean solution(String inputString) {
        if (inputString.length() % 2 == 1) return false;
        char[] chars = inputString.toCharArray();
        int i = 0;
        String s = "";

        if (chars[i] == chars[chars.length/2]) {
            s = inputString.substring(i, chars.length/2);
        } else return false;


        int l = s.length();
        for (int k = 0; k < inputString.length(); k += s.length()) {
            if (!inputString.substring(k, l).equals(s)) return false;
            l = l + s.length();
        }
        return true;
    }
}
