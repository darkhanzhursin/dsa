package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategy.PaymentByCreditCard;
import patterns.behavioral.strategy.strategy.PaymentByPayPal;

public class Main {
    /*
    - defines a family of behaviors, puts each of them into a separate class, and makes their objects interchangeable
    - strategies are easily replaceable and interchangeable by clients at runtime
    - applies the Single Responsibility and Open-Closed Principles
    - each strategy is now isolated in a separate class, and we can easily introduce new strategies
    * */

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);
    }
}
