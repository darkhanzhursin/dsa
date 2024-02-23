package oopAbstractionAndInterface;

// Cat class (subclass of Animal) implementing Soundable interface
class Cat extends Animal implements Soundable {
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Method overriding for eat()
    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method overriding for sleep()
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Method overriding for makeSound() from Soundable interface
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
