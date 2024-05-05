package patterns.behavioral.observer;

public record EmailMsgListener(String email) implements Listener {

    @Override
    public void update(Event eventType) {
        // Actually send the email
        System.out.println("Sending mail to " + email + " concerning " + eventType);
    }
}
