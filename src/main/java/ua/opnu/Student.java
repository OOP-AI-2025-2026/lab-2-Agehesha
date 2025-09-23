package ua.opnu;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int year;
    private List<String> courses;

    // Constructor
    public Student(String name, int year) {
        if (year < 1 || year > 4) {
            throw new IllegalArgumentException("Year must be between 1 and 4");
        }
        this.name = name;
        this.year = year;
        this.courses = new ArrayList<>();
    }

    // Add a course
    public void addCourse(String courseName) {
        if (courseName != null && !courseName.isEmpty()) {
            courses.add(courseName);
        }
    }

    // Drop all courses
    public void dropAll() {
        courses.clear();
    }

    // Return number of courses
    public int getCourseCount() {
        return courses.size();
    }

    // Return student name
    public String getName() {
        return name;
    }

    // Return year of study
    public int getYear() {
        return year;
    }

    // Return tuition fee (20000 per year)
    public int getTuition() {
        return year * 20000;
    }
}
