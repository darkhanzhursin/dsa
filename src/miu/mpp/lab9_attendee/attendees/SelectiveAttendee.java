package miu.mpp.lab9_attendee.attendees;

import miu.mpp.lab9_attendee.sessions.Session;

import java.util.ArrayList;
import java.util.List;

public class SelectiveAttendee extends Attendee {
    List<Session> sessionList;

    public SelectiveAttendee(String name, String address) {
        super(name, address);
        this.sessionList = new ArrayList<>();
    }

    public void addSession(Session session) {
        sessionList.add(session);
    }
    @Override
    public double getRegistrationFee() {
        return sessionList.stream().mapToDouble(Session::getFee).sum();
    }

    public double smallestFee() {
        return sessionList.stream().mapToDouble(Session::getFee).min().orElse(0);
    }
}
