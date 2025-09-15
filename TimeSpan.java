public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Невірні аргументи конструктора");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void add(int h, int m) {
        if (h < 0 || m < 0 || m > 59) {
            throw new IllegalArgumentException("Невірні аргументи для додавання");
        }
        int totalMinutes = getTotalMinutes() + h * 60 + m;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public void addTimeSpan(TimeSpan span) {
        add(span.getHours(), span.getMinutes());
    }

    public double getTotalHours() {
        return hours + minutes / 60.0;
    }

    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    public void subtract(TimeSpan span) {
        int totalCurrent = getTotalMinutes();
        int totalOther = span.getTotalMinutes();

        if (totalOther > totalCurrent) {
            throw new IllegalArgumentException("Вхідний інтервал більший за поточний");
        }

        int diff = totalCurrent - totalOther;
        this.hours = diff / 60;
        this.minutes = diff % 60;
    }

    public void scale(int factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Фактор має бути > 0");
        }
        int totalMinutes = getTotalMinutes() * factor;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    @Override
    public String toString() {
        return hours + " год " + minutes + " хв";
    }
}
