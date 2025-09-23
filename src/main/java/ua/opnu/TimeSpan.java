package ua.opnu;

public class TimeSpan {
    private int hours;
    private int minutes;

    // Constructor
    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Invalid time values");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    // Returns only the hours part
    public int getHours() {
        return hours;
    }

    // Returns only the minutes part
    public int getMinutes() {
        return minutes;
    }

    // Adds hours and minutes to the interval
    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Invalid values for add()");
        }
        this.minutes += minutes;
        this.hours += hours + this.minutes / 60;
        this.minutes %= 60;
    }

    // Adds another TimeSpan to this one
    public void addTimeSpan(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    // Returns total hours as a decimal number
    public double getTotalHours() {
        return hours + minutes / 60.0;
    }

    // Returns total minutes (hours * 60 + minutes)
    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    // Subtracts another TimeSpan from this one
    public void subtract(TimeSpan span) {
        int total = getTotalMinutes() - span.getTotalMinutes();
        if (total < 0) {
            throw new IllegalArgumentException("Cannot subtract larger interval");
        }
        this.hours = total / 60;
        this.minutes = total % 60;
    }

    // Multiplies the interval by a factor
    public void scale(int factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Factor must be > 0");
        }
        int total = getTotalMinutes() * factor;
        this.hours = total / 60;
        this.minutes = total % 60;
    }
}

