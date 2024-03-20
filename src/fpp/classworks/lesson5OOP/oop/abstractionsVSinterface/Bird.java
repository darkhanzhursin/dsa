package fpp.classworks.lesson5OOP.oop.abstractionsVSinterface;

public class Bird extends Animal implements Flyable {

    public Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " chirps.");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}
