package fpp.homeworks.lesson4;

public class Solution {
    public static void main(String[] args) {
        reverseDigits(123);

        System.out.println(countTheNumOfDigits(12345));

        int[] arr = new int[] {1, 2, 3, 4};
        System.out.println(sumArr(arr, arr.length));
    }
    static void reverseDigits(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            System.out.print(n % 10);
            reverseDigits(n / 10);
        }
    }

    static int counter = 0;
    static int countTheNumOfDigits(int num) {
        if (num < 10) {
            return 1;
        } else {
            return 1 + countTheNumOfDigits(num / 10);
        }
    }

    static int sumArr(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + sumArr(arr, n - 1);
    }
}
