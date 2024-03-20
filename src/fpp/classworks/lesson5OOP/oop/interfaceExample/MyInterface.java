package fpp.classworks.lesson5OOP.oop.interfaceExample;

public interface MyInterface {

    int MY_CONSTANT = 10; // public static final int

    void myAbstractMethod(); // public abstract void

    default void defaultMethodInInterface() { // public default void
        print();
        printSmt();
        System.out.println("Implemented method in an interface.");
    }

    static void staticMethodInInterface() { // public static void
        printSmt();
        System.out.println("Static method inside an interface.");
    }

    private static void printSmt() {
        System.out.println("Print private static method");
    }

    private void print() {
        System.out.println("Print private method");
    }
}
