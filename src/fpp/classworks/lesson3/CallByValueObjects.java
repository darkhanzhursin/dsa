package fpp.classworks.lesson3;

import fpp.classworks.immutable.Employee;

public class CallByValueObjects {

    public static void main(String[] args) {
        CallByValueObjects c = new CallByValueObjects();
        Employee alice = new Employee("Alica", 30000.0);
        Employee bob = new Employee("Bob", 3000000.0);

        c.swap(alice, bob);
        System.out.println("A: " + alice.getName());
        System.out.println("B: " + bob.getName());
    }

    void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("X: " + x.getName());
        System.out.println("Y: " + y.getName());
    }
}
