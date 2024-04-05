package miu.mpp.library.copies;

import miu.mpp.library.common.Loan;
import miu.mpp.library.items.IItem;

public class ItemCopy implements IItemCopy {
    private String copyId;
    private boolean isAvailable;
    private IItem item;
    private Loan loan;

    public ItemCopy(String copyId, boolean isAvailable) {
        this.copyId = copyId;
        this.isAvailable = isAvailable;
    }

    public String getCopyId() {
        return copyId;
    }

    public void setCopyId(String copyId) {
        this.copyId = copyId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public IItem getItem() {
        return item;
    }

    public void setItem(IItem item) {
        this.item = item;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
}
