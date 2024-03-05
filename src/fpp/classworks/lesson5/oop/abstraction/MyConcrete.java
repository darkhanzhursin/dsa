package fpp.classworks.lesson5.oop.abstraction;

public class MyConcrete extends MyAbstract {
    public MyConcrete(int value) {
        super(value);
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }

    public static void main(String[] args) {
        MyConcrete.staticMethod();

        MyConcrete c = new MyConcrete(12);
        c.instanceMethod();
        c.abstractMethod();
    }
}
