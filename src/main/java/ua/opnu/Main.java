package ua.opnu;

public class Main {
    public static void main(String[] args) {
        // === Test Student ===
        Student st = new Student("Ivan", 2);
        st.addCourse("Math");
        st.addCourse("Programming");

        System.out.println(st.getName() + ": number of courses - " + st.getCourseCount());
        System.out.println(st.getName() + ": year - " + st.getYear());
        System.out.println(st.getName() + ": tuition paid - " + st.getTuition());

        // === Test BankAccount ===
        BankAccount acc1 = new BankAccount();
        acc1.name = "Alex";
        acc1.deposit(1000);
        acc1.transactionFee = 10;

        BankAccount acc2 = new BankAccount();
        acc2.name = "Maria";

        acc1.transfer(acc2, 200);

        System.out.println(acc1.name + " balance: " + acc1.getBalance());
        System.out.println(acc2.name + " balance: " + acc2.getBalance());

        // === Test TimeSpan ===
        TimeSpan t1 = new TimeSpan(2, 30);
        TimeSpan t2 = new TimeSpan(1, 45);

        t1.addTimeSpan(t2);
        System.out.println("t1 total minutes: " + t1.getTotalMinutes());
        System.out.println("t1 total hours: " + t1.getTotalHours());
    }
}
