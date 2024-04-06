package miu.mpp.library.common;

import miu.mpp.library.copies.IItemCopy;
import miu.mpp.library.members.Member;

import java.time.LocalDate;

public class Loan {
    private LocalDate checkoutDate;
    private LocalDate returnDate;
    private IItemCopy itemCopy;
    private Member member;

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public IItemCopy getItemCopy() {
        return itemCopy;
    }

    public void setItemCopy(IItemCopy itemCopy) {
        this.itemCopy = itemCopy;
    }
}
