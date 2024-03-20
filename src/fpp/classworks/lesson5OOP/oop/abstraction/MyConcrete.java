package fpp.classworks.lesson5OOP.oop.abstraction;

public class MyConcrete extends MyAbstract {
    public MyConcrete(int value) {
        super(value);
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }

    public static void main(String[] args) {
        MyAbstract.staticMethod();
        MyConcrete.staticMethod();

        MyConcrete c = new MyConcrete(12);
        c.instanceMethod();
        c.abstractMethod();
    }
}
