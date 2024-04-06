package miu.mpp.library.members;

import miu.mpp.library.common.Loan;
import miu.mpp.library.common.Reservation;

import java.util.ArrayList;
import java.util.List;

public class Member implements IMember {
    private String id;
    private String name;
    private String address;
    private String phone;
    private List<Loan> loanList;
    private List<Reservation> reservationList;

    public Member(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.loanList = new ArrayList<>();
        this.reservationList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void reserve(Reservation reservation) {
        if (reservation.checkAvailability()) reservationList.add(reservation);
        else System.out.println("Item is not available");
    }
    public void borrow(Loan loan) {
        System.out.println("Check out date is: " + loan.getCheckoutDate());
        loanList.add(loan);
        System.out.println("Return date is: " + loan.getReturnDate());
    }
    public void returnItem(Loan loan) {
        loan.getItemCopy().setAvailability(true);
        System.out.println("Returned");
    }
}
