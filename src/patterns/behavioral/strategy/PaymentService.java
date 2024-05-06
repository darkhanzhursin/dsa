package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategy.PaymentStrategy;

public class PaymentService {

    private int cost;
    private boolean includeDelivery = true;

    private PaymentStrategy strategy;

    public void processOrder(int cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
