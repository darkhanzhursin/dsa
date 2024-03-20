package fpp.classworks.lesson4Reoursive;

public class RecursiveCountdown {

    public static void main(String[] args) {
        System.out.println(fact(3));
        //countDown(3);
        //System.out.println(len("ORANGE"));
        //printCharsReverse("ORANGE");
    }

    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static void printCharsReverse(String str) {
        if (str == null || str.equals("")) {
            return;
        } else {
            printCharsReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    static int len(String str) {
        if (str == null || str.equals("")) return 0;
            else return 1 + len(str.substring(1));
    }
    static void countDown(int n) {
        if (n <= 0) {
            System.out.println();
        } else {
            System.out.println(n);
            countDown(n-1);
        }
        System.out.println("End!");
    }
}
