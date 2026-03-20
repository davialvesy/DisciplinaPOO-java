public class BankAccount {
    private int numAccount;
    private double accountBalance;

    public BankAccount() {
        this.numAccount = 1;
        this.accountBalance = 0;
    }

    public BankAccount(int numAccount, double accountBalance) {
        this.numAccount = numAccount;
        this.accountBalance = accountBalance;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
