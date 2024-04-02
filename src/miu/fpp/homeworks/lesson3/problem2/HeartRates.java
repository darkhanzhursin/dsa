package miu.fpp.homeworks.lesson3.problem2;

import java.time.LocalDate;

public class HeartRates {

    private static final int RHR = 70;
    private static final double LB = 0.5;
    private static final double UB = 0.85;

    private String firstName;
    private String lastName;
    private LocalDate birthday;

    public HeartRates(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    AgeCalculator ageCalculator = new AgeCalculator();
    private int age;
    private int getMHR() {
        age = ageCalculator.calculateAge(birthday).getYears();
        return 220 - age;
    }

    private int calculateAHR() {
        return getMHR() - RHR;
    }

    private double calculateLowerBoundaryHR() {
        return calculateAHR() * LB + RHR;
    }

    private double calculateUpperBoundaryHR() {
        return calculateAHR() * UB + RHR;
    }

    private void printTargetHR() {
        double lbhr = calculateLowerBoundaryHR();
        double ubhr = calculateUpperBoundaryHR();
        System.out.println("The Target Heart Rate Range is between " + lbhr + " and " + ubhr);
    }

    @Override
    public String toString() {
        printTargetHR();
        return "First Name : " + firstName  +
                "\nLast Name : " + lastName +
                "\nAge : " + age +
                "\nDate of Birth : " + birthday +
                "\nMaximum Heart Rate : " + getMHR();
    }
}
