package miu.mpp.lab3.post;

import miu.mpp.lab3.customer.ACustomer;

public class UPS extends PostService {

    public UPS(double weight, String desc, ACustomer aCustomer) {
        super(weight, desc, aCustomer);
    }

    @Override
    public double getPrice() {
        double discount = getCustomer().discount();
        double cost = 0.45;
        return discount * cost * getWeight();
    }

    @Override
    public String toString() {
        return "UPS";
    }
}
