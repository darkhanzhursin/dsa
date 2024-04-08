package miu.mpp.orderTracking.orders;

import miu.mpp.orderTracking.products.IProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderLine {
    private int quantity;
    private double price;
    private String status;
    private LocalDate shipDate;
    private double points;

    private Order order;
    private List<IProduct> products;

    public OrderLine(int quantity, double price, String status, LocalDate shipDate) {
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.shipDate = shipDate;
        this.products = new ArrayList<>();
    }

    public void addProduct(IProduct product) {
        products.add(product);
    }
    public double computePrice() {
        return products.stream().mapToDouble(p -> p.getPrice() * quantity).sum();
    }

    public double computePoints() {
        points = products.stream().mapToDouble(p -> p.getPoints() * quantity).sum();
        return points;
    }
}
