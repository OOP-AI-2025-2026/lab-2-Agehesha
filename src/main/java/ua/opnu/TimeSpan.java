package ua.opnu;

public class TimeSpan {

    private int hours;
    private int minutes;

    // Constructor
    TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Invalid hours or minutes");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    // Return only hours
    int getHours() {
        return hours;
    }

    // Return only minutes
    int getMinutes() {
        return minutes;
    }

    // Add hours and minutes to the interval
    void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Invalid hours or minutes");
        }
        this.hours += hours;
        this.minutes += minutes;
        normalize();
    }

    // Add another TimeSpan
    void addTimeSpan(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    // Return total hours as double
    double getTotalHours() {
        return hours + minutes / 60.0;
    }

    // Return total minutes
    int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    // Subtract another TimeSpan
    void subtract(TimeSpan span) {
        int totalThis = getTotalMinutes();
        int totalOther = span.getTotalMinutes();
        if (totalOther > totalThis) {
            throw new IllegalArgumentException("Cannot subtract a bigger timespan");
        }
        int diff = totalThis - totalOther;
        hours = diff / 60;
        minutes = diff % 60;
    }

    // Scale the interval by factor
    void scale(int factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Factor must be > 0");
        }
        int total = getTotalMinutes() * factor;
        hours = total / 60;
        minutes = total % 60;
    }

    // Normalize minutes to always be < 60
    private void normalize() {
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
    }
}
