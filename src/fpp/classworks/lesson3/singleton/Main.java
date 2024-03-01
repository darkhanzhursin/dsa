package fpp.classworks.lesson3.singleton;

public class Main {

    static void example1() {
        SingletonExample singleton1 = SingletonExample.getInstance();
        SingletonExample singleton2 = SingletonExample.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }

    static void example2() {
        SingletonKeyExample key1 = SingletonKeyExample.getSingletonObject();
        SingletonKeyExample key2 = SingletonKeyExample.getSingletonObject();
        //System.out.println(key1.key);
        System.out.println(key1 == key2);
    }

    public static void main(String[] args) {
        example1();
    }
}
