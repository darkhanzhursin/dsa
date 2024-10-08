package oop.animal;

// Dog class (subclass of Animal)
class Dog extends Animal {
    // Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
