package miu.mpp.orderTracking.customers;

import miu.mpp.orderTracking.enums.Ratings;

public class CorporateCust extends ACustomer {
    private Ratings creditRating;
    private double creditLimit;
    public CorporateCust(String name, String address, String phone, double points, Ratings creditRating, double creditLimit) {
        super(name, address, phone, points);
        this.creditRating = creditRating;
        this.creditLimit = creditLimit;
    }

    public void setCreditRating(Ratings creditRating) {
        this.creditRating = creditRating;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public Ratings getCreditRating() {
        return creditRating;
    }


}
