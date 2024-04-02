package miu.fpp.classworks.lesson6Nested.anon;

@FunctionalInterface
public interface MyFunctionalInterface {


    int discount(int x, int y);

    static void print() {
        System.out.println("Hi!");
    }
}
