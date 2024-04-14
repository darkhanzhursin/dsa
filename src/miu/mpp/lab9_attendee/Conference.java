package miu.mpp.lab9_attendee;

import miu.mpp.lab9_attendee.attendees.IAttendee;

import java.util.ArrayList;
import java.util.List;

public class Conference {
    private String name;
    private final double fullConferenceFee = 4000;

    List<IAttendee> attendeeList;

    public Conference(String name) {
        this.name = name;
        this.attendeeList = new ArrayList<>();
    }

    public void addAttendee(IAttendee attendee) {
        attendeeList.add(attendee);
    }

    public String getName() {
        return name;
    }

    public double getFullFee() {
        return fullConferenceFee;
    }

    public double getTotalPayments() {
        return attendeeList.stream().mapToDouble(attendee -> attendee.getRegistrationFee()).sum();
    }

    public String getSmallestName() {
        return attendeeList.stream().map(IAttendee::getName).min((s1, s2) -> s1.compareTo(s2)).orElse(null);
    }
}
