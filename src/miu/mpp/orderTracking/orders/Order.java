package miu.mpp.orderTracking.orders;

import miu.mpp.orderTracking.customers.ICustomer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private ICustomer customer;
    private String orderNumber;
    private boolean prepaid;
    private double orderPrice;
    private LocalDate orderDate;
    private String status;

    List<OrderLine> orderLines;

    public Order(ICustomer customer, String orderNumber, boolean prepaid, double orderPrice, LocalDate orderDate, String status) {
        this.customer = customer;
        this.orderNumber = orderNumber;
        this.prepaid = prepaid;
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.status = status;
        this.orderLines = new ArrayList<>();
    }

    private double getTotalPrice() {
        double totalPrice = orderLines.stream().mapToDouble(OrderLine::computePrice).sum();
        if (getCustomerPoints() >= 25.0) {
            totalPrice *= 0.6;
            setCustomerPoints(0);
        }
        return totalPrice;
    }

    public double getCustomerPoints() {
        return customer.getPoints();
    }

    public void setCustomerPoints(double zero) {
        //double points = orderLines.stream().mapToDouble(OrderLine::computePoints).sum();
        customer.setPoints(zero);
    }

    public boolean getPrepaid() {
        return prepaid;
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }
}
