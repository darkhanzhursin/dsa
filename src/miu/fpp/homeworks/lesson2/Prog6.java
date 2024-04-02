package miu.fpp.homeworks.lesson2;

public class Prog6 {

    static int min(int[] arrayOfInts) {
        int count = Integer.MAX_VALUE;

        for (int i : arrayOfInts) {
            if (count > i) {
                count = i;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(min(new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22}));
    }
}
