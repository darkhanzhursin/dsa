package epam.thread;

public class Multithread2 implements Runnable {
    @Override
    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "RunnableThread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
