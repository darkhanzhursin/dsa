package miu.mpp.lab4_payroll;

import java.time.LocalDate;

public class Order {
    private String orderNo;
    private LocalDate orderDate;
    private int orderAmount;

    private double price;


    public Order(String orderNo, LocalDate orderDate, int orderAmount, double price) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.price = price;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public double getPrice() {
        return price * orderAmount;
    }

}
