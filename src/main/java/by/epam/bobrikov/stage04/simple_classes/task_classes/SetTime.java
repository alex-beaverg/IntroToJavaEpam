package by.epam.bobrikov.stage04.simple_classes.task_classes;

public class SetTime {
    private int hours;
    private int minutes;
    private int seconds;

    public SetTime() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public void printCurrentTime() {
        System.out.println("Current time: " + hours + ":" + minutes + ":" + seconds);
    }

    public void setAllTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }
}
