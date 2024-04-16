package algos.leetcode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if (s.isEmpty() || s == null) return 0;

        String[] res = s.trim().split("\\s+");
        return res[res.length-1].length();
    }

    public static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");
    }
}
