package miu.mpp.lab9_attendee.attendees;

import miu.mpp.lab9_attendee.Conference;

public class FullAttendee extends Attendee {

    private Conference conference;
    public FullAttendee(String name, String address, Conference conference) {
        super(name, address);
        this.conference = conference;
    }

    @Override
    public double getRegistrationFee() {
        return conference.getFullFee();
    }


}
