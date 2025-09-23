package ua.opnu;

public class BankAccount {
    private String name;
    private double balance;
    private double transactionFee = 0; // Default value is 0

    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = Math.max(balance, 0); // Balance cannot be negative
    }

    // Sets a new transaction fee
    public void setTransactionFee(double fee) {
        if (fee >= 0) {
            this.transactionFee = fee;
        }
    }

    // Deposits money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Returns current balance
    public double getBalance() {
        return this.balance;
    }

    // Withdraws money (with transaction fee)
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance -= (amount + transactionFee);
            return true;
        }
        return false;
    }

    // Transfers money to another account (including transaction fee)
    public boolean transfer(BankAccount receiver, double amount) {
        if (receiver == null || amount <= 0) return false;
        if (balance >= amount + transactionFee) {
            balance -= (amount + transactionFee);
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}
