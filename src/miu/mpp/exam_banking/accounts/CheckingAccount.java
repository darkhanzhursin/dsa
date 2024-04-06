package miu.mpp.exam_banking.accounts;

public class CheckingAccount extends Account {

    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount(String acctId, double monthlyFee, double balance) {
        this.acctId = acctId;
        this.monthlyFee = monthlyFee;
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
        return balance - monthlyFee;
    }
}
