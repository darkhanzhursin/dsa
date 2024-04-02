package miu.fpp.homeworks.lesson2;

public class Prog1 {
    public static void main(String[] args) {
        int num1 = RandomNumbers.getRandomInt(1 , 9);
        double result1 = Math.pow(Math.PI, num1);

        int num2 = RandomNumbers.getRandomInt(3, 14);
        double result2 = Math.pow(num2, Math.PI);

        System.out.println(result1);
        System.out.println(result2);
    }
}
