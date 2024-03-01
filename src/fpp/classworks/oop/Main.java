package fpp.classworks.oop;

public class Main {

    public static void main(String[] args) {
        ImmutableEmployee immutableEmployee = new ImmutableEmployee("Anna", 150000.0);

        System.out.println(immutableEmployee.getName());
        System.out.println(immutableEmployee.getSalary());
    }
}
