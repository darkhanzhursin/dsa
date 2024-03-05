package fpp.homeworks.lesson5.prob4;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new CommissionEmployee("John", "Wick", "1", 120000.0, 20),
                new BasePlusCommissionEmployee("Bob", "Wick", "2", 130000.0, 20, 50000.0),
                new SalariedEmployee("Larry", "Brain", "3", 1000.0),
                new HourlyEmployee("Harry", "Kane", "4",  40, 120),
                new SalariedEmployee("Tom", "Jerry", "5", 900.0)
        };

        double total = 0.0;
        for (Employee e : employees) {
            total += e.getPayment();
        }

        System.out.println("Total :" + total);
    }
}
