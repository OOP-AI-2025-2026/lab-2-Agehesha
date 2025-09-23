package ua.opnu;

// ======== Клас Студент ========
public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        if (name == null || name.isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        if (grade < 0 || grade > 100) {
            this.grade = 0;
        } else {
            this.grade = grade;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public boolean hasPassed() {
        return grade >= 60;
    }
}
