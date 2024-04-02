package miu.fpp.homeworks.lesson5.prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("John", LocalDate.of(2020, 1, 20),
                220000.0, 25);
        DeptEmployee professor2 = new Professor("Ben", LocalDate.of(2019, 5, 20),
                215000.0, 20);
        Secretary secretary1 = new Secretary("Anna", LocalDate.of(2015, 4, 9),
                80000.0, 120);
        Secretary secretary2 = new Secretary("Bob", LocalDate.now(), 60000.0, 0);
        DeptEmployee secretary3 = new Secretary("Lilly", LocalDate.of(2012, 4, 21),
                140000.0, 10);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = professor1;
        department[1] = professor2;
        department[2] = secretary1;
        department[3] = secretary2;
        department[4] = secretary3;
        salaryOutput(department);

    }
    static void salaryOutput(DeptEmployee[] department) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Y if want to see sum of employees salaries");
        if (scanner.nextLine().equals("Y")) {
            double sum = 0;
            for (DeptEmployee e : department) {
                sum += e.computeSalary();
            }
            System.out.println(sum);
        };
    }
}
