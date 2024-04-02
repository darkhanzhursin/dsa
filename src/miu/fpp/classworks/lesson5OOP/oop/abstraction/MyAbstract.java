package miu.fpp.classworks.lesson5OOP.oop.abstraction;

public abstract class MyAbstract {
    private static int staticVariable;
    private int instanceVariable;

    public MyAbstract(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public static void staticMethod() {
        System.out.println("My static method.");
    }

    public void instanceMethod() {
        System.out.println("My instance method.");
    }

    public abstract void abstractMethod();
}
