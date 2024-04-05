package miu.mpp.lab3.customers;

public class Senior extends ACustomer {

    public Senior(String name, int age) {
        super(name, age);
    }

    @Override
    public double discount() {
        return 0.85;
    }
}
