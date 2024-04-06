package miu.mpp.library;

import miu.mpp.library.common.Library;
import miu.mpp.library.copies.ItemCopy;
import miu.mpp.library.items.Book;
import miu.mpp.library.members.Member;

public class LibraryApp {

    public static void main(String[] args) {
        Library library = new Library();
        Member member1 = new Member("1", "Darkhan", "4th Street 1000", "319123123");
        library.addMember(member1);
        ItemCopy copy1 = new ItemCopy("1", true);
        Book greatGatsby = new Book("Great Gatsby", "1234", 6);
        copy1.setItem(greatGatsby);
        library.addItemCopy(copy1);
    }
}
