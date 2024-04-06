package miu.mpp.exam_banking.accounts;

public abstract class Account {

    public abstract String getAccountId();
    public abstract double getBalance();
    public abstract double computeUpdatedBalance();
}
