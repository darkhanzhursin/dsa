package fpp.classworks.lesson2;

public class NestedLoops {
    static void nestedLoop1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-3s", "*");
            }
            System.out.println();
        }
    }

    static void nestedLoop2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-3s", "*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nestedLoop2(5);
    }
}
