package miu.mpp.orderTracking.customers;

import miu.mpp.orderTracking.enums.Ratings;
import miu.mpp.orderTracking.orders.Order;

public class PersonalCust extends ACustomer {

    private Ratings creditRating;
    private String creditCard;
    public PersonalCust(String name, String address, String phone, double points, String creditCard) {
        super(name, address, phone, points);
        this.creditRating = Ratings.POOR;
        this.creditCard = creditCard;
    }

    public void setCreditRating(Ratings creditRating) {
        this.creditRating = creditRating;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public Ratings getCreditRating() {
        return creditRating;
    }

    @Override
    public void addOrder(Order order) {
        if (this.creditRating.equals(Ratings.POOR) && !order.getPrepaid()) {
            System.out.println("Sorry! You should make prepaid first.");
            return;
        }
        super.addOrder(order);
    }
}
