package fpp;

public class BinaryNums {

    static void getComplementedValue(int value) {
        int complementedValue = ~value;
        System.out.println("Value: " + value + " complementedValue: " + complementedValue);
        System.out.println("Binary of the value: " + Integer.toBinaryString(value));
        System.out.println("Binary of the complemented value: " + Integer.toBinaryString(complementedValue));
    }

    static void bitwiseLeftShift(int num, int shiftedByNum) {
        int leftShift = num << shiftedByNum;
        System.out.println("Num: " + num + " left shift by 2 = " + leftShift);
        System.out.println("Binary of the num: " + Integer.toBinaryString(num));
        System.out.println("Binary of the left shifted value: " + Integer.toBinaryString(leftShift));
    }

    static void bitwiseRightShift(int num, int shiftedByNum) {
        int rightShift = num >> shiftedByNum;
        System.out.println("Num: " + num + " right shift by 2 = " + rightShift);
        System.out.println("Binary of the num: " + Integer.toBinaryString(num));
        System.out.println("Binary of the right shifted value: " + Integer.toBinaryString(rightShift));
    }


    public static void main(String[] args) {
        //getComplementedValue(3);
        //bitwiseLeftShift(12, 2);
        bitwiseRightShift(7, 2);
    }
}
