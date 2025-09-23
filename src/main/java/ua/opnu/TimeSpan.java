package ua.opnu;

public class TimeSpan {
    int hours;
    int minutes;

    TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    int getHours() {
        return hours;
    }

    int getMinutes() {
        return minutes;
    }

    void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) return;
        int total = getTotalMinutes() + hours * 60 + minutes;
        this.hours = total / 60;
        this.minutes = total % 60;
    }

    void addTimeSpan(TimeSpan timespan) {
        if (timespan == null) return;
        add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        return hours + minutes / 60.0;
    }

    int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    void subtract(TimeSpan span) {
        if (span == null) return;
        int cur = getTotalMinutes();
        int sub = span.getTotalMinutes();
        if (sub > cur) return;
        int total = cur - sub;
        this.hours = total / 60;
        this.minutes = total % 60;
    }

    void scale(int factor) {
        if (factor <= 0) return;
        int total = getTotalMinutes() * factor;
        this.hours = total / 60;
        this.minutes = total % 60;
    }
}
