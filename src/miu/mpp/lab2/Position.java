package miu.mpp.lab2;

import java.util.Objects;

public class Position {
    private String title;
    private String description;
    private Employee employee;
    private Department department;

    public Position(String title, String description, Department department) {
        this.title = title;
        this.description = description;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void print() {
        System.out.println();
        System.out.println("Position: " + title);
        System.out.println("Description: " + description);
        if (Objects.nonNull(employee)) employee.print();
        else System.out.println("This position is still open.");
    }

    public double getSalary() {
        if (Objects.isNull(employee)) return 0.0;
        return employee.getSalary();
    }

    public void printDownLine() {

    }


}
