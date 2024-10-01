package algos.leetcode;

public class KthCharacter {
    public static void main(String[] args) {
        kthCharacter(5);
    }

    public static char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");

        while (sb.length() < k) {
            String generated = generate(sb.toString());
            sb.append(generated);
        }

        String res= sb.toString();

        return res.charAt(k);
    }

    static String generate(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'z') {
                sb.append('a');
                continue;
            }
           char c = (char) (s.charAt(i) + 1);
           sb.append(c);
        }
        return sb.toString();
    }
}
