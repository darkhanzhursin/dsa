package epam.thread;

public class Main {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Multithread thread = new Multithread();
            thread.start();

            Thread object
                    = new Thread(new Multithread2());
            object.start();
        }
    }
}
