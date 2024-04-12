package miu.mpp.lab9_attendee.attendees;

public abstract class Attendee implements IAttendee {

    private String name;
    private String address;

    public Attendee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public abstract double getRegistrationFee();
}
