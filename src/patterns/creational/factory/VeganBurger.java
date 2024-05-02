package patterns.creational.factory;

public class VeganBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing Vegan Burger...");
    }
}
