package miu.mpp.lab4_payroll.employees;

import miu.mpp.lab4_payroll.DateRange;
import miu.mpp.lab4_payroll.Paycheck;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private final double fica = 23;
    private final double state = 5;
    private final double local = 1;
    private final double medicare = 3;
    private final double socialSec = 7.5;
    private int empId;
    private List<Paycheck> paycheckList;

    public Employee(int empId) {
        this.empId = empId;
        this.paycheckList = new ArrayList<>();
    }

    public void print() {
        paycheckList.forEach(Paycheck::print);
    }
    public Paycheck calcCompensation(int month, int year) {
        int firstDay = DateRange.getFirstDayOfMonth();
        int lastDay = DateRange.getLastDayOfMonth(month, year);
        DateRange dateRange = new DateRange(LocalDate.of(year, month, firstDay),
                LocalDate.of(year, month, lastDay));
        double gross = calcGrossPay(dateRange);
        Paycheck paycheck = new Paycheck(gross, fica, state, local, medicare, socialSec, dateRange, this);
        addPaycheck(paycheck);
        return paycheck;
    }

    private void addPaycheck(Paycheck paycheck) {
        paycheckList.add(paycheck);
    }

    abstract double calcGrossPay(DateRange dateRange);

    @Override
    public String toString() {
        return "empId=" + empId;
    }
}
