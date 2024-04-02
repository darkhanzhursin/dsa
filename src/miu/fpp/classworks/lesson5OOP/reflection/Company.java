package miu.fpp.classworks.lesson5OOP.reflection;

import java.util.Objects;

public class Company {
    private final String name;
    private int numOfEmployees;

    public Company(String name, int numOfEmployees) {
        this.name = name;
        this.numOfEmployees = numOfEmployees;
    }

    public String getName() {
        return name;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    private void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    private static void internalRules() {
        System.out.println("This is the internal rules.");
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", numOfEmployees=" + numOfEmployees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (numOfEmployees != company.numOfEmployees) return false;
        return Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfEmployees, name);
    }
}
