package miu.mpp.lab3.customer;

public class Person extends ACustomer {

    public Person(String name, int age) {
        super(name, age);
    }

    @Override
    public double discount() {
        return 1;
    }
}
