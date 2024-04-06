package miu.mpp.exam_banking.accounts;

public class SavingsAccount extends Account {

    private String acctId;
    private double interestRate;
    private double balance;

    public SavingsAccount(String acctId, double interestRate, double balance) {
        this.acctId = acctId;
        this.interestRate = interestRate;
        this.balance = balance;
    }

    @Override
    public String getAccountId() {
        return acctId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return interestRate * balance + balance;
    }
}
