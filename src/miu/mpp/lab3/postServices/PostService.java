package miu.mpp.lab3.postServices;

import miu.mpp.lab3.customers.ACustomer;

public abstract class PostService implements IService {
    private double weight;
    private String description;
    private String zone;

    private ACustomer customer;

    public PostService(double weight, String desc, ACustomer customer) {
        this.weight = weight;
        this.description = desc;
        this.customer = customer;
    }

    public ACustomer getCustomer() {
        return customer;
    }

    public void setCustomer(ACustomer customer) {
        this.customer = customer;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double getPrice();
}
