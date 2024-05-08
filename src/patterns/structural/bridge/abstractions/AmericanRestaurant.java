package patterns.structural.bridge.abstractions;

import patterns.structural.bridge.implementations.Pizza;

public class AmericanRestaurant extends Restaurant {

    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("any");
    }

    @Override
    void addToppings() {
        pizza.setToppings("everything");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");
    }
}
