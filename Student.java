import java.util.ArrayList;

public class Student {
    private String name;
    private int year;
    private ArrayList<String> courses;

    public Student(String name, int year) {
        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Рік навчання має бути від 1 до 4");
        }
        this.name = name;
        this.year = year;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Назва курсу не може бути пустою");
        }
        courses.add(courseName);
    }

    public void dropAll() {
        courses.clear();
    }

    public int getCourseCount() {
        return courses.size();
    }

    public String getName() {
        return name;
    }

    public int getTuition() {
        return year * 20000;
    }

    public int getYear() {
        return year;
    }
}
