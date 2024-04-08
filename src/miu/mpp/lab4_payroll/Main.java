package miu.mpp.lab4_payroll;

import miu.mpp.lab4_payroll.employees.Commissioned;
import miu.mpp.lab4_payroll.employees.Employee;
import miu.mpp.lab4_payroll.employees.Hourly;
import miu.mpp.lab4_payroll.employees.Salaried;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("01", LocalDate.now(),2, 200);
        Order order2 = new Order("02", LocalDate.now(), 1, 100);
        Commissioned benComm = new Commissioned(1, 7, 1000);
        benComm.addOrder(order1);
        benComm.addOrder(order2);
        Employee johnHour = new Hourly(2, 15, 40);
        Employee lisaSal = new Salaried(3, 5000);

        benComm.calcCompensation(4, 2024);
        johnHour.calcCompensation(4, 2024);
        lisaSal.calcCompensation(4, 2024);

        List<Employee> employeeList = List.of(benComm, lisaSal, johnHour);
        employeeList.forEach(Employee::print);
    }
}
