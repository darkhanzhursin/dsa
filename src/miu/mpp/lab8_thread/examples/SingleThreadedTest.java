package miu.mpp.lab8_thread.examples;

public class SingleThreadedTest {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            createAndStartThread();
            System.out.println("Num instances: " + Singleton.count);
        }
    }

    private static void createAndStartThread() {
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                Singleton.getInstance();
            }
        };
        new Thread(r).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
