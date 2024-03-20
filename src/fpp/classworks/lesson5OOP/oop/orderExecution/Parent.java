package fpp.classworks.lesson5OOP.oop.orderExecution;

public class Parent {
    static int value;
    int instanceValue;

    static {
        value = 10;
        System.out.println("Parent static block value: " + value);
    }

    {
        instanceValue = 20;
        System.out.println("Parent instance block instanceValue = " + instanceValue);
    }

    public Parent(int v) {
        instanceValue = v;
        System.out.println("Inside parent constructor: " + instanceValue);
    }
}
