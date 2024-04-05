package miu.mpp.lab3.customers;

public class Student extends ACustomer {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public double discount() {
        return 0.9;
    }

}
