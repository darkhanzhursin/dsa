package miu.mpp.exam_banking;

import miu.mpp.exam_banking.accounts.Account;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accountList;
    public Employee(String name) {
        this.name = name;
        accountList = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public String getName() {
        return name;
    }

    public double computeUpdatedBalanceSum() {
        //implement
        return accountList.stream().mapToDouble(Account::computeUpdatedBalance).sum();
    }
}
