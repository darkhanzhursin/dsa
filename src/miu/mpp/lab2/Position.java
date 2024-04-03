package miu.mpp.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Position {
    private String title;
    private String description;
    private Employee employee;
    private Department department;
    private List<Position> inferiors;
    private Position superior;

    public static final String HEAD = "Head";
    public static final String TOP_EXECUTIVE = "Top Executive";

    public Position(String title, String description, Department department) {
        this.title = title;
        this.description = description;
        this.department = department;
        this.inferiors = new ArrayList<>();
    }

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
        this.inferiors = new ArrayList<>();
    }

    public Position getSuperior() {
        return superior;
    }

    public void setSuperior(Position superior) {
        this.superior = superior;
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
        if (hasSuperior()) System.out.println("Superior: " + superior.employee.getFirstName());
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
        print();
        if (Objects.nonNull(inferiors)) {
            for (Position position : inferiors) {
                position.printDownLine();
            }
        }
    }

    public boolean hasSuperior() {
        return Objects.nonNull(superior);
    }

    public void addInferior(Position inferior) {
        inferiors.add(inferior);
    }
}
