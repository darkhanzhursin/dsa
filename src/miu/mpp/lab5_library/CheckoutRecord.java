package miu.mpp.lab5_library;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

    private List<CheckoutRecordEntry> recordEntryList;

    public CheckoutRecord() {
        this.recordEntryList = new ArrayList<>();
    }

    public void addCheckoutEntry(CheckoutRecordEntry entry) {
        recordEntryList.add(entry);
    }

    public List<CheckoutRecordEntry> getRecordEntryList() {
        return recordEntryList;
    }
}
