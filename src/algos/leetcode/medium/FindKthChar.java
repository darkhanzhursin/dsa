package algos.leetcode.medium;

public class FindKthChar {
    public char findKthBit(int n, int k) {
        String s1 = "0";
        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            String inverted = invert(s1);
            String reversed = new StringBuilder(inverted).reverse().toString();
            s1 = s1 + "1" + reversed;
            n--;
        }

        return s1.charAt(k - 1);
    }

    private String invert(String s) {
        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == '0') {
//                sb.append("1");
//            } else {
//                sb.append("0");
//            }
//        }
        String inverted = s;
        return sb.toString();
    }

    public static void main(String[] args) {
        FindKthChar obj = new FindKthChar();
        System.out.println(obj.findKthBit(3, 1));
    }
}
