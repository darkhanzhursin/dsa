package miu.mpp.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {
    private String name;
    private List<Department> departments;
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void print() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.print();
        }
    }

    public double getSalary() {
        double totalSalary = departments.stream().mapToDouble(Department::getSalary).sum();
        System.out.println("Total salary: " + totalSalary);
        return totalSalary;
    }

    public Position getTopExecutive() {
        Department dept = departments.stream().filter(d -> Objects.nonNull(d.getDepartmentHead())).findAny().get();
        return dept.getDepartmentHead().getSuperior();
    }

    public void printReportingHierarchy() {
        Position top = getTopExecutive();
        top.printDownLine();
    }
}
