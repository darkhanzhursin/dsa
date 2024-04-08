package miu.mpp.orderTracking;

import miu.mpp.orderTracking.points.AudioVideoPoints;
import miu.mpp.orderTracking.points.ComputerPoints;
import miu.mpp.orderTracking.products.IProduct;
import miu.mpp.orderTracking.products.Product;

public class Main {

    public static void main(String[] args) {
        IProduct product1 = new Product("desc1", "001", 23.0, new ComputerPoints());
        IProduct product2 = new Product("desc2", "002", 43.5, new AudioVideoPoints());
    }
}
