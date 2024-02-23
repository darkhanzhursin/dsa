package oop;

// Cat class (subclass of Animal)
class Cat extends Animal {
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
