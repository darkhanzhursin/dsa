package patterns.structural.bridge.abstractions;

import patterns.structural.bridge.implementations.Pizza;

public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    void addToppings() {
        pizza.setToppings("-");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thin");
    }
}
