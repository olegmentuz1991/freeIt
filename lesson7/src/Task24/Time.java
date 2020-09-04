package Task24;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int seconds) {
        this.seconds = seconds;
    }

    public Time calculateTime() {
        if (seconds > 59) {
            hours += seconds / 3600;
            seconds = seconds % 3600;
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes > 59) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }

        return (new Time(hours, minutes, seconds));

    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
    //Типо compareTo

    public int compareTime(Time time) {
        if (time.hours < this.hours) {
            return 1;
        } else if (time.hours > this.hours) {
            return -1;
        } else if (time.minutes < this.minutes) {
            return 1;
        } else if (time.minutes > this.minutes) {
            return -1;
        } else if (time.seconds < this.seconds) {
            return 1;
        } else if (time.seconds > this.seconds) {
            return -1;
        } else {
            return 0;
        }
    }
}
