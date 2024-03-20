package codesignal.core;

public class SecondRightmostZeroBit {
    static int solution(int n) {
        String binaryString = Integer.toBinaryString(n);
        int firstZeroIndex = binaryString.lastIndexOf('0');
        int secondZeroIndex = binaryString.lastIndexOf('0', firstZeroIndex - 1);
        return 1 << (binaryString.length() - secondZeroIndex - 1);
    }

    static int solution2(int n) {
        return 1 << (Integer.toBinaryString(n).length() - Integer.toBinaryString(n).lastIndexOf('0', Integer.toBinaryString(n).lastIndexOf('0') - 1) - 1);
    }

    public static void main(String[] args) {
        System.out.println(solution2(1073741824));

    }
}
