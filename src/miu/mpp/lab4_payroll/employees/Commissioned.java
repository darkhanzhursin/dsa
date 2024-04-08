package miu.mpp.lab4_payroll.employees;

import miu.mpp.lab4_payroll.DateRange;
import miu.mpp.lab4_payroll.Order;
import miu.mpp.lab4_payroll.Paycheck;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(int empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public double calcGrossPay(DateRange dateRange) {
        double bonus = orders.stream().mapToDouble(Order::getPrice).sum();
        return baseSalary + bonus * (commission / 100);
    }
}
