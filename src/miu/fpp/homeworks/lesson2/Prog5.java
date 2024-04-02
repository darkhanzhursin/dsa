package miu.fpp.homeworks.lesson2;

import java.util.Arrays;

public class Prog5 {
    static void combine(int[] arr1, int[] arr2) {
        int[] copy = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, copy, 0, arr1.length);
        System.arraycopy(arr2, 0, copy, arr1.length, arr2.length);
        System.out.println(Arrays.toString(copy));
    }

    public static void main(String[] args) {
        combine(new int[] {5, 6, -4, 3, 1}, new int[] {3,8,9,11});
    }
}
