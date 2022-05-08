package Zad5;

public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) throws InsufficientFundsException {
        if(balance >= amount){
            balance-=amount;
            return amount;
        } else {
            throw new InsufficientFundsException();
        }
    }

    public double getBalance() {
        return balance;
    }
}
