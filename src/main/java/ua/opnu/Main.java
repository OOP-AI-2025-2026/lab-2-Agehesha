package ua.opnu;

// ======== Тестування ========
public class Main {
    public static void main(String[] args) {
        // Student
        Student s = new Student("Ivan", 20, 85);
        System.out.println(s.getName() + " adult? " + s.isAdult());
        System.out.println(s.getName() + " passed? " + s.hasPassed());

        // BankAccount
        BankAccount a1 = new BankAccount("Alice", 1000, 5);
        BankAccount a2 = new BankAccount("Bob", 500, 2);

        a1.transfer(a2, 200);
        System.out.println("Alice balance: " + a1.getBalance());
        System.out.println("Bob balance: " + a2.getBalance());

        // TimeSpan
        TimeSpan t1 = new TimeSpan(2, 30);
        TimeSpan t2 = new TimeSpan(1, 45);
        t1.addTimeSpan(t2);
        System.out.println("Total: " + t1.getHours() + "h " + t1.getMinutes() + "m");
    }
}
