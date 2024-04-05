package miu.mpp.library.common;

import miu.mpp.library.items.IItem;
import miu.mpp.library.members.Member;

import java.time.LocalDate;

public class Reservation {
    private LocalDate reservationDate;
    private Member member;
    private IItem item;

    public boolean checkAvailability() {
        return item.checkAvailability();
    }
}
