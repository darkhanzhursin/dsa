package patterns.structural.bridge;

import patterns.structural.bridge.abstractions.AmericanRestaurant;
import patterns.structural.bridge.abstractions.ItalianRestaurant;
import patterns.structural.bridge.abstractions.Restaurant;
import patterns.structural.bridge.implementations.PepperoniPizza;
import patterns.structural.bridge.implementations.VeggiePizza;

public class Main {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }
}
