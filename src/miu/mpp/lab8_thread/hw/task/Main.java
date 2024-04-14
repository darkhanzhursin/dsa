package miu.mpp.lab8_thread.hw.task;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inside Main");
        int all = 133;
        int numberOfThreads = 10;
        int part = countThreads(all, numberOfThreads);
        int initial = 1;
        for (int i = 1; i <= numberOfThreads; i++) {
            PrimeThread p = new PrimeThread(i, initial, part);
            initial += part;
            p.start();
            try {
                p.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static int countThreads(int all, int nThreads) {
        return all / nThreads;
    }
}
