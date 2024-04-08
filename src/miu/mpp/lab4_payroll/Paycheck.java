package miu.mpp.lab4_payroll;

import miu.mpp.lab4_payroll.employees.Employee;

public class Paycheck {

    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;
    private DateRange payPeriod;

    private Employee employee;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
                    DateRange period, Employee employee) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        payPeriod = period;
        this.employee = employee;
    }

    public void print() {
        //System.out.println(employee.toString() +  " " + getNetPay());
        System.out.printf("$%,.2f %-10s\n", getNetPay(), employee);
    }
    public double getNetPay() {
        double taxes = fica + state + local + medicare + socialSecurity;
        return grossPay * (1 - taxes/100);
    }
}
