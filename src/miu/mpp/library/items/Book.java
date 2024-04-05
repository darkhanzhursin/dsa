package miu.mpp.library.items;

import java.util.ArrayList;
import java.util.List;

public class Book extends AItem {

    private String isbn;
    private List<String> authorList;
    private int limit;
    public Book(String title, String ISBN, int limit) {
        super(title);
        this.isbn = ISBN;
        this.limit = limit;
        authorList = new ArrayList<>();
    }

    public void addAuthor(String author) {
        authorList.add(author);
    }

    @Override
    public boolean checkAvailability() {
        return getItems().isEmpty();
    }
}
