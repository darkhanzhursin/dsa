package miu.mpp.theater;

public class Seat {

    private boolean reserved;

    public Seat() {
        this.reserved = false;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        reserved = true;
    }

    public void unreserve() {
        reserved = false;
    }
}
