package miu.mpp.lab3.postServices;

import miu.mpp.lab3.customers.ACustomer;

public class USMail extends PostService {
    private final double cost = 0.55;
    public USMail(double weight, String desc, ACustomer aCustomer) {
        super(weight, desc, aCustomer);
    }
    @Override
    public double getPrice() {
        double discount = getCustomer().discount();
        double weight = getWeight();
        if (weight < 3) return discount * 1;
        return discount * cost * weight;
    }

    @Override
    public String toString() {
        return "US Mail";
    }
}
