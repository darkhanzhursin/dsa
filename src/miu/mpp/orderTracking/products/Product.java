package miu.mpp.orderTracking.products;

import miu.mpp.orderTracking.points.ICompPoints;

public class Product implements IProduct {
    private String description;
    private String productNumber;
    private double price;
    private ICompPoints point;

    public Product(String description, String productNumber, double price, ICompPoints point) {
        this.description = description;
        this.productNumber = productNumber;
        this.price = price;
        this.point = point;
    }

    @Override
    public double getPoints() {
        return point.getPoints();
    }

    public String getDescription() {
        return description;
    }

    public String getProductNumber() {
        return productNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
