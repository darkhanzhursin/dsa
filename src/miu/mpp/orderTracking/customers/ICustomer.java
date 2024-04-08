package miu.mpp.orderTracking.customers;

import miu.mpp.orderTracking.enums.Ratings;

public interface ICustomer {

    Ratings getCreditRating();

    double getPoints();

    void setPoints(double points);
}
