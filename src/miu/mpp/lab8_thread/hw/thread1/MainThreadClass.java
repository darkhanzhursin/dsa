package miu.mpp.lab8_thread.hw.thread1;

public class MainThreadClass {

    public static void main( String[] args ) {

        System.out.println("Inside main  ");        

        PrimeThread p = new PrimeThread(143);
        p.start();

    }
}
