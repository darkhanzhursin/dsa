package miu.mpp.lab8_thread.examples;

public class MultiThreadedTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            multipleCalls();
            System.out.println("Num instances: " + Singleton.count);
        }
    }

    public static void multipleCalls() {
        Runnable r = () -> {
            for (int i = 0; i < 5000; i++) {
                Singleton.getInstance();
            }
        };
        for (int i = 0; i < 1000; i++) {
            new Thread(r).start();
        }
    }
}

