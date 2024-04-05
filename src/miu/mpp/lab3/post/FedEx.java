package miu.mpp.lab3.post;

import miu.mpp.lab3.customer.ACustomer;

public class FedEx extends PostService {
    public FedEx(double weight, String description, String zone, ACustomer aCustomer){
        super(weight, description, aCustomer);
        setZone(zone);
    }

    private double getCost() {
        double cost;
        switch (getZone()) {
            case "IA", "MT", "OR", "CA":
                cost = 0.35;
                break;
            case "TX", "UT":
                cost = 0.30;
                break;
            case "FL", "MA", "OH":
                cost = 0.55;
                break;
            default: cost = 0.43;
        }
        return cost;
    }

    @Override
    public double getPrice() {
        return getCustomer().discount() * getCost() * getWeight();
    }

    @Override
    public String toString() {
        return "FedEx";
    }
}
