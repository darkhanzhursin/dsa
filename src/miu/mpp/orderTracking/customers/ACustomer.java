package miu.mpp.orderTracking.customers;

import miu.mpp.orderTracking.enums.Ratings;
import miu.mpp.orderTracking.orders.Order;

import java.util.ArrayList;
import java.util.List;

public abstract class ACustomer implements ICustomer {

    private String name;
    private String address;
    private String phone;
    private double points;

    private List<Order> orderList;

    public ACustomer(String name, String address, String phone, double points) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.points = points;
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public double getPoints() {
        return points;
    }

    @Override
    public void setPoints(double points) {
        this.points = points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public abstract Ratings getCreditRating();
}
