package oop;

public class Main {
    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Buddy", 3);
        animals[1] = new Cat("Whiskers", 5);

        // Iterate through the array and call makeSound() method
        for (Animal animal : animals) {
            animal.makeSound();
            System.out.println(animal);
        }
    }
}
