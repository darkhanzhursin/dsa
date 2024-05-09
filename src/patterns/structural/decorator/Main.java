package patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        INotifier notifyAll = new FacebookDecorator(
                new WhatsAppDecorator(
                        new Notifier("Username1")
                )
        );
        notifyAll.send("Some messages 1.");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(
                new Notifier("Username2")
        );
        notifyFbMail.send("Some messages 2.");
    }
}
