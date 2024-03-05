package fpp.classworks.lesson5.oop.abstractionsVSinterface;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}
