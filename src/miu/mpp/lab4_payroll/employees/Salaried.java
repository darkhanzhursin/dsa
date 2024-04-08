package miu.mpp.lab4_payroll.employees;

import miu.mpp.lab4_payroll.DateRange;
import miu.mpp.lab4_payroll.employees.Employee;

public class Salaried extends Employee {
    private double salary;

    public Salaried(int empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return salary;
    }
}
