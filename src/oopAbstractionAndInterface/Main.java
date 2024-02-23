package oopAbstractionAndInterface;

public class Main {

    public static void main(String[] args) {
        // Create an array of Animal objects
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 3);
        animals[1] = new Cat("Whiskers", 5);
        animals[2] = new NotSoundableAnimal("NoSound", 1);

        // Iterate through the array and call methods
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            if (animal instanceof Soundable) {
                ((Soundable) animal).makeSound();
            }
        }
    }
}
