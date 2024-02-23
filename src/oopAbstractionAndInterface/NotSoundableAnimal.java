package oopAbstractionAndInterface;

public class NotSoundableAnimal extends Animal {

    public NotSoundableAnimal(String name, int age) {
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
}
