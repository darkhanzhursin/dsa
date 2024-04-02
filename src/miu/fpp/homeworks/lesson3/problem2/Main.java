package miu.fpp.homeworks.lesson3.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static HeartRates create() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String firstName = myObj.nextLine();
        System.out.println("Please, enter your last name:");
        String lastName = myObj.nextLine();
        AgeCalculator ageCalculator = new AgeCalculator();
        LocalDate birthday = ageCalculator.getBirthday();
        return new HeartRates(firstName, lastName, birthday);
    }
    public static void main(String[] args) {
        System.out.println(create());
    }
}
