package miu.mpp.lab8_thread.examples;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;
    public static int counter = 0;
    private SynchronizedSingleton() {
        incrementCounter();
    }
    synchronized public static SynchronizedSingleton getInstance() {
        if (instance == null) instance = new SynchronizedSingleton();
        return instance;
    }

    private static void incrementCounter() {
        counter++;
    }
}
