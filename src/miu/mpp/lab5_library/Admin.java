package miu.mpp.lab5_library;

import java.util.*;

public class Admin {
    public static String getPhoneNums(LibraryMember[] members, LendingItem item) {
        List<String> phoneNums = new ArrayList<>();
        for (LibraryMember m : members) {
             List<CheckoutRecordEntry> list = m.getRecord().getRecordEntryList().stream()
                     .filter(entry -> entry.getLendingItem()
                             .equals(item)).toList();
             if (!list.isEmpty()) phoneNums.add(m.getPhone());
        }
        Collections.sort(phoneNums, Comparator.naturalOrder());
        return phoneNums.toString();

//        return Arrays.stream(members)
//                .flatMap(m -> m.getRecord()
//                        .getRecordEntryList().
//                        stream()
//                        .filter(entry -> entry.getLendingItem().equals(item))
//                        .map(entry -> m.getPhone())).sorted().toList().toString();
    }
}
