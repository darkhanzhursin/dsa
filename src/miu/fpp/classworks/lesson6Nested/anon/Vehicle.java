package miu.fpp.classworks.lesson6Nested.anon;

public class Vehicle {

    String name;

    public Vehicle(String name) {
        this.name = name;
    }

    Vehicle() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printSomething() {
        System.out.println("Vehicle");
    }
}
