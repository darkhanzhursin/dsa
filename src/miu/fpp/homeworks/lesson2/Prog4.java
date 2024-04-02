package miu.fpp.homeworks.lesson2;

public class Prog4 {

    public static void main(String[] args) {
        float num1 = 1.27f;
        float num2 = 3.881f;
        float num3 = 9.6f;
        float sum = num1 + num2 + num3;
        int sumAsInt = (int) sum;
        int roundedSum = Math.round(sum);
        System.out.println(sumAsInt);
        System.out.println(roundedSum);
    }
}
