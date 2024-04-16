package miu.mpp.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department implements Cloneable {
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
        System.out.println(this);
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

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(location, that.location)) return false;
        if (!Objects.equals(positions, that.positions)) return false;
        return Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, company);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department cloned = (Department) super.clone();
        List<Position> positions = new ArrayList<>();
        for (Position p : this.positions) positions.add(p);
        cloned.setPositions(positions);
        return cloned;
    }
}
