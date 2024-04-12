package miu.mpp.lab9_attendee.sessions;

public class Session {

    private String name;
    private double fee;

    public Session(String name, double fee) {
        this.name = name;
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
}
