package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance < 0 ? 0 : balance;
        this.transactionFee = 0;
    }

    void setTransactionFee(double fee) {
        if (fee >= 0) {
            this.transactionFee = fee;
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    double getBalance() {
        return balance;
    }

    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance = balance - (amount + transactionFee);
            return true;
        }
        return false;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if (receiver == null || amount <= 0) return false;
        if (balance >= amount + transactionFee) {
            balance = balance - (amount + transactionFee);
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}
