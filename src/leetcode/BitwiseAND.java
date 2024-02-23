package leetcode;

public class BitwiseAND {

    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        // Find the common leading bits by right shifting both left and right until they are equal
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        // Shift back the common leading bits to their original positions
        return left << shift;
    }

    public static void main(String[] args) {
        rangeBitwiseAnd(5, 7);
    }
}
