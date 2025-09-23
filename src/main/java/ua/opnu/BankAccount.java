package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0.0;

    // Deposit money (must be > 0)
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Get current balance
    double getBalance() {
        return this.balance;
    }

    // Withdraw money considering transactionFee
    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance -= (amount + transactionFee);
            return true;
        }
        return false;
    }

    // Transfer money to another account
    boolean transfer(BankAccount receiver, double amount) {
        if (amount > 0 && balance >= amount + transactionFee) {
            balance -= (amount + transactionFee);
            receiver.balance += amount;
            return true;
        }
        return false;
    }
}
