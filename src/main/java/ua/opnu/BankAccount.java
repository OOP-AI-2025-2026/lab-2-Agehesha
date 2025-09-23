package ua.opnu;

// ======== Клас Банк аккаунт ========
public class BankAccount {
    private String name;
    private double balance;
    private double transactionFee;

    public BankAccount(String name, double balance, double transactionFee) {
        this.name = name;
        this.balance = balance;
        this.transactionFee = transactionFee;
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
        double total = amount + transactionFee;
        if (amount > 0 && balance >= total) {
            balance = balance - total;
            return true;
        }
        return false;
    }

    public boolean transfer(BankAccount receiver, double amount) {
        if (this.withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}
