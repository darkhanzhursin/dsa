package miu.mpp.lab4_payroll.employees;

import miu.mpp.lab4_payroll.DateRange;
import miu.mpp.lab4_payroll.employees.Employee;

public class Hourly extends Employee {

    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(int empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return hourlyWage * hoursPerWeek * 4;
    }
}
