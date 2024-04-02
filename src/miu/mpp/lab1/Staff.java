package miu.mpp.lab1;

public class Staff extends Person {

    private double salary;
    private double gpa;
    public Staff(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        if (gpa != 0.0) return "staffstudents";
        return "Staff";
    }
}
