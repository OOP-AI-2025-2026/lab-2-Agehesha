package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    public BankAccount() {
        this.name = "Unknown";
        this.balance = 0;
        this.transactionFee = 0;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance < 0 ? 0 : balance;
        this.transactionFee = 0;
    }

    public void setTransactionFee(double fee) {
        if (fee >= 0) {
            this.transactionFee = fee;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance = balance - (amount + transactionFee);
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount receiver, double amount) {
        if (receiver == null || amount <= 0) return false;
        if (balance >= amount + transactionFee) {
            balance = balance - (amount + transactionFee);
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}
