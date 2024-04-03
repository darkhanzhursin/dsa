package miu.mpp.lab2;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;

    private List<Position> positions;
    private Company company;

    public Department(String name, String location, Company company) {
        this.name = name;
        this.location = location;
        this.positions = new ArrayList<>();
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPosition(Position position) {
        positions.add(position);
    }

    public void print() {
        System.out.println();
        System.out.println("Department: " + name);
        for (Position position : positions) {
            position.print();
        }
    }

    public double getSalary() {
        return positions.stream().mapToDouble(Position::getSalary).sum();
    }

    public void  printReportingHierarchy() {
        Position head = getDepartmentHead();
        System.out.println(head.getTitle());
    }

    public Position getDepartmentHead() {
        return positions.stream().filter(p -> p.getTitle().equals(Position.HEAD)).findFirst().get();
    }
}
