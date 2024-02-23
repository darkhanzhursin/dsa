package oopAbstractionAndInterface;

abstract class Animal {
    // Properties
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method eat()
    public abstract void eat();

    // Abstract method sleep()
    public abstract void sleep();
}
