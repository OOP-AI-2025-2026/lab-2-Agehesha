package ua.opnu;

// ======== Клас Часовий інтервал ========
public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (hours < 0) {
            this.hours = 0;
        } else {
            this.hours = hours;
        }
        if (minutes < 0 || minutes > 59) {
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void add(int h, int m) {
        if (h >= 0 && m >= 0) {
            hours = hours + h;
            minutes = minutes + m;
            hours = hours + minutes / 60;
            minutes = minutes % 60;
        }
    }

    public void addTimeSpan(TimeSpan t) {
        add(t.getHours(), t.getMinutes());
    }

    public double getTotalHours() {
        return hours + minutes / 60.0;
    }

    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    public void subtract(TimeSpan t) {
        int total1 = getTotalMinutes();
        int total2 = t.getTotalMinutes();
        if (total1 >= total2) {
            int diff = total1 - total2;
            hours = diff / 60;
            minutes = diff % 60;
        } else {
            hours = 0;
            minutes = 0;
        }
    }

    public void scale(int factor) {
        if (factor > 0) {
            int total = getTotalMinutes() * factor;
            hours = total / 60;
            minutes = total % 60;
        } else {
            hours = 0;
            minutes = 0;
        }
    }
}
