package miu.mpp.lab9_attendee.attendees;

public class FullAttendee extends Attendee {

    public FullAttendee(String name, String address) {
        super(name, address);
    }

    @Override
    public double getRegistrationFee() {
        return 4000;
    }
}
