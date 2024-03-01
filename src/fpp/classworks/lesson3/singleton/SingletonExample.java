package fpp.classworks.lesson3.singleton;

// 1. Private static instance variable
// 2. Private constructor
// 3. Non-private static getInstance() method
public class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
