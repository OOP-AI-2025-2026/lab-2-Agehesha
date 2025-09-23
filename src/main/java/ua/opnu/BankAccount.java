package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0.0;

    // Deposit money to the account
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    // Get current balance
    double getBalance() {
        return this.balance;
    }

    // Withdraw money considering transaction fee
    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance = balance - (amount + transactionFee);
            return true;
        }
        return false;
    }

    // Transfer money to another account considering transaction fee
    boolean transfer(BankAccount receiver, double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance = balance - (amount + transactionFee);
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}
