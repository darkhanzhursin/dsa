package miu.mpp.lab2;

import java.util.Objects;

public class Employee {

    private Position position;

    private int employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String birthDate;
    private String SSN;
    private double salary;

    public Employee(int employeeId, String firstName, String middleInitial, String lastName,
                    String birthDate, String SSN, double salary, Position position) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
        this.salary = salary;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", SSN='" + SSN + '\'' +
                ", salary=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(salary, employee.salary) != 0) return false;
        if (!Objects.equals(position, employee.position)) return false;
        if (!Objects.equals(firstName, employee.firstName)) return false;
        if (!Objects.equals(middleInitial, employee.middleInitial))
            return false;
        if (!Objects.equals(lastName, employee.lastName)) return false;
        if (!Objects.equals(birthDate, employee.birthDate)) return false;
        return Objects.equals(SSN, employee.SSN);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = position != null ? position.hashCode() : 0;
        result = 31 * result + employeeId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleInitial != null ? middleInitial.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (SSN != null ? SSN.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void print() {
        System.out.println(this);
    }
}
