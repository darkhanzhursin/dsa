package miu.mpp.lab8_thread.examples;

public class Singleton {
    private static Singleton instance;
    public static int count = 0;
    private Singleton() {
        incrementCounter();
    }
    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    private static void incrementCounter() {
        count++;
    }
}
