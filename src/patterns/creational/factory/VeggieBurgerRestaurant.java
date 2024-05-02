package patterns.creational.factory;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Creating Vegan Burger...");
        return new VeganBurger();
    }
}
