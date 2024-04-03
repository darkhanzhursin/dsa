package miu.mpp.lab2;

import java.util.ArrayList;
import java.util.List;

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
        return null;
    }

    public void printReportingHierarchy() {}
}
