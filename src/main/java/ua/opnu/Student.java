package ua.opnu;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents a student with name, year and courses.
 */
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

    // Adds a course to student's list
    public void addCourse(String courseName) {
        courses.add(courseName);
    }

    // Removes all courses
    public void dropAll() {
        courses.clear();
    }

    // Returns number of courses
    public int getCourseCount() {
        return courses.size();
    }

    // Returns student name
    public String getName() {
        return name;
    }

    // Returns tuition fee (20000 per year)
    public int getTuition() {
        return year * 20000;
    }

    // Returns study year
    public int getYear() {
        return year;
    }
}
