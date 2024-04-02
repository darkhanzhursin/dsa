package miu.fpp.homeworks.lesson5.prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, LocalDate hireDate, double salary, double overtimeHours) {
        super(name, hireDate, salary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    protected double computeSalary() {
        return super.computeSalary() + 12 * overtimeHours;
    }
}
