package miu.mpp.lab8_thread.hw.thread2;

public class MainThreadClass {

    public static void main( String[] args ) {

        System.out.println("Inside main  ");   

        for (int i = 1; i <= 10; i++)
        {
           PrimeThread p = new PrimeThread(i);
           p.start();
        }

    }
}
