package ua.opnu;

public class Main {
    public static void main(String[] args) {
        // Create a student object
        Student st = new Student("Ivan Petrenko", 2);

        // Add some courses
        st.addCourse("Mathematics");
        st.addCourse("Programming");
        st.addCourse("Physics");

        // Print number of courses
        System.out.println(st.getName() + ": number of courses - " + st.getCourseCount());

        // Print year of study
        System.out.println(st.getName() + ": year of study - " + st.getYear());

        // Print tuition fee
        System.out.println(st.getName() + ": tuition paid - " + st.getTuition());
    }
}
