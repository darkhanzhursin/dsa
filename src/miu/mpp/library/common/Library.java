package miu.mpp.library.common;

import miu.mpp.library.copies.IItemCopy;
import miu.mpp.library.members.IMember;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<IMember> memberList;
    private List<IItemCopy> itemCopies;

    public Library() {
        this.memberList = new ArrayList<>();
        this.itemCopies = new ArrayList<>();
    }

    public void addMember(IMember member) {
        memberList.add(member);
    }

    public void addItemCopy(IItemCopy copy) {
        itemCopies.add(copy);
    }

    public List<IMember> getMemberList() {
        return memberList;
    }

    public List<IItemCopy> getItemCopies() {
        return itemCopies;
    }
}
