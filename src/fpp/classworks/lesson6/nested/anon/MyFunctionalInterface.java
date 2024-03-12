package fpp.classworks.lesson6.nested.anon;

@FunctionalInterface
public interface MyFunctionalInterface {


    int discount(int x, int y);

    static void print() {
        System.out.println("Hi!");
    }
}
