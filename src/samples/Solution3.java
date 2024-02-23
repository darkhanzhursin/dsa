package samples;

public class Solution3 {

    public char[] f(char[] chars, int start, int len) {

        int size = chars.length;
        if (chars == null || start < 0 || len < 0 || len + start > size) return null;
        char[] res = new char[len];

        for (int j = 0; j < len; j++) {
            res[j] = chars[start];
            start++;
        }

        return res;
    }
}
