package miu.mpp.lab8_thread.hw.task;

public class PrimeThread extends Thread {
    private int threadNum;
    private int initial;
    private int part;

    public PrimeThread(int threadNum, int initial, int part) {
        this.threadNum = threadNum;
        this.initial = initial;
        this.part = part;
    }

    @Override
    public void run() {
        System.out.println("Inside 'run' of thread  " + threadNum);
        int i;
        for (i = initial; i <= initial + part; i++) {
            if (isPrime(i)) System.out.println("Prime number: " + i);
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
