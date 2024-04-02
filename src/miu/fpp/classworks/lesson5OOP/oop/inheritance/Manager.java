package miu.fpp.classworks.lesson5OOP.oop.inheritance;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        // no direct access to private variables of superclass
        double baseSalary =  super.getSalary();
        return baseSalary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void raiseSalary(double byPercent) {
        super.raiseSalary(byPercent);
    }
}
