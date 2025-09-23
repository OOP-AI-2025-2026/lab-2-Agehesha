package ua.opnu;

import java.util.ArrayList;

public class Student {
    String name;
    int year;
    ArrayList<String> courses;

    Student(String name, int year) {
        this.name = name;
        this.year = (year < 1 || year > 4) ? 1 : year;
        this.courses = new ArrayList<>();
    }

    void addCourse(String courseName) {
        if (courseName != null && !courseName.isEmpty()) {
            courses.add(courseName);
        }
    }

    void dropAll() {
        courses.clear();
    }

    int getCourseCount() {
        return courses.size();
    }

    String getName() {
        return name;
    }

    int getTuition() {
        return year * 20000;
    }

    int getYear() {
        return year;
    }
}
