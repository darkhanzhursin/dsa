package patterns.creational.factory;

/*
- How can an object be created so that subclasses can redefine which class to instantiate?
- How can a class defer instantiation to subclasses?

    The factory method design pattern handles these problems by defining a separate method for creating the objects,
which subclasses can then override to specify the derived type of product that will be created. The factory method
pattern relies on inheritance, as object creation is delegated to subclasses that implement the factory method to
create objects.

    The Factory Method design pattern describes how to solve such problems:
- Define a separate operation (factory method) for creating an object.
- Create an object by calling a factory method.
* */
public class Main {

    public static void main(String[] args) {
        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();

        System.out.println("==========================================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();
    }
}
