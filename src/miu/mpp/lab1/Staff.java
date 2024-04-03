package miu.mpp.lab1;

public class Staff extends Person {

//    private double salary;

    public Staff(String name, String phone, int age, double salary) {
        super(name, phone, age);
        super.setSalary(salary);
    }

    public double getSalary() {
        return super.getSalary();
    }

    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public String toString() {
        return "Staff";
    }
}
