package ua.opnu;

public class Main {
    public static void main(String[] args) {
        // Student example
        Student st = new Student("Ivan", 2);
        st.addCourse("Math");
        st.addCourse("Physics");
        st.addCourse("Programming");
        System.out.println(st.getName() + ": number of courses - " + st.getCourseCount());
        System.out.println(st.getName() + ": year of study - " + st.getYear());
        System.out.println(st.getName() + ": tuition paid - " + st.getTuition());

        // BankAccount example
        BankAccount acc1 = new BankAccount("Petro", 1000);
        BankAccount acc2 = new BankAccount("Oleh", 500);
        acc1.setTransactionFee(10);
        acc1.withdraw(200);
        acc1.transfer(acc2, 300);
        System.out.println("Petro's balance: " + acc1.getBalance());
        System.out.println("Oleh's balance: " + acc2.getBalance());

        // TimeSpan example
        TimeSpan t1 = new TimeSpan(2, 30);
        TimeSpan t2 = new TimeSpan(1, 45);
        t1.addTimeSpan(t2);
        System.out.println("Total hours: " + t1.getTotalHours());
        System.out.println("Total minutes: " + t1.getTotalMinutes());
    }
}
