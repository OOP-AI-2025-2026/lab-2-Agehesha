public class BankAccount {
    private String name;
    private double balance;
    private double transactionFee = 0.0;

    public BankAccount(String name, double balance) {
        this.name = name;
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не може бути від'ємним");
        }
        this.balance = balance;
    }

    public void setTransactionFee(double fee) {
        if (fee < 0) {
            throw new IllegalArgumentException("Комісія не може бути від'ємною");
        }
        this.transactionFee = fee;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сума депозиту має бути > 0");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сума зняття має бути > 0");
        }
        if (balance >= amount + transactionFee) {
            balance -= (amount + transactionFee);
        }
    }

    public void transfer(BankAccount receiver, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сума переказу має бути > 0");
        }
        if (balance >= amount + transactionFee) {
            this.balance -= (amount + transactionFee);
            receiver.balance += amount;
        }
    }
}
