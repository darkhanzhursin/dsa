package algos.leetcode.easy.binary;

public class BinaryAddition {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String a1 = "11";
        String b1 = "1";
        System.out.println(addBinary(a1, b1)); // Output: "100"

        String a2 = "1010";
        String b2 = "1011";
        System.out.println(addBinary(a2, b2)); // Output: "10101"
    }
}
