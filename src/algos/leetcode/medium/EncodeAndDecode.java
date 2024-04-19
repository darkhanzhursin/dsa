package algos.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {

    public static void main(String[] args) {
        decode(encode(List.of("lint","code","love","you")));
    }

    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for (String s : strs) {
            ans.append((char) s.length()).append(s);
        }
        return ans.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        List<String> ans = new ArrayList<>();
        int i = 0, n = s.length();
        while (i < n) {
            int size = s.charAt(i++);
            ans.add(s.substring(i, i + size));
            i += size;
        }
        return ans;
    }
}
