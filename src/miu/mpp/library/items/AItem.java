package miu.mpp.library.items;

import miu.mpp.library.copies.IItemCopy;

import java.util.ArrayList;
import java.util.List;

public abstract class AItem implements IItem {
    private String title;

    private List<IItemCopy> items;

    public AItem(String title) {
        this.title = title;
        items = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    void addItem(IItemCopy copy) {
        items.add(copy);
    }

    public List<IItemCopy> getItems() {
        return items;
    }

    @Override
    public abstract boolean checkAvailability();
}
