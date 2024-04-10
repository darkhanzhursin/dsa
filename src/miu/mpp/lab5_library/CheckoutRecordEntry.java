package miu.mpp.lab5_library;

import java.time.LocalDate;

public class CheckoutRecordEntry {
    private LocalDate checkoutDate;
    private LocalDate dueDate;

    private LendingItem lendingItem;

    private ItemType itemType;

    public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.lendingItem = lendingItem;
        this.itemType = itemType;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LendingItem getLendingItem() {
        return lendingItem;
    }
}
