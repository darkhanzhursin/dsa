package fpp.classworks.lesson3;

// Changing the signature of methods
// 1. The number of parameters in two methods.
// 2. The data types of the parameters of methods.
// 3. The Order of the parameters of methods.

// You can change the return type of a method along with the method signature.
public class MethodOverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double add(double b, int a) {
        return a + b;
    }

    void printSmth() {
        System.out.println("Smth");
    }

    String printSmth(String name) {
        System.out.println(name);
        return "printed";
    }

    void printSmth(int count, String name) {
        System.out.println("name");
    }

    String printSmth(String name, int count) {
        System.out.println(name + count);
        return "printed";
    }
}
