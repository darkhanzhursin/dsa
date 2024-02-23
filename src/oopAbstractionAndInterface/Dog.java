package oopAbstractionAndInterface;

public class Dog extends Animal implements Soundable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
