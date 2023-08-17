package by.epam.bobrikov.stage04.simple_classes.task_classes;

import java.util.Arrays;

public class Airline {
    private String destination;
    private int flightNumber;
    private String planeType;
    private String time;
    private String[] weekDays;

    public Airline(String destination, int flightNumber, String planeType, String time, String[] weekDays) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.time = time;
        this.weekDays = weekDays;
    }

    public String getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }

    public String[] getWeekDays() {
        return weekDays;
    }

    @Override
    public String toString() {
        return "\nAirline: " +
                "destination = '" + destination + '\'' +
                ", flightNumber = " + flightNumber +
                ", planeType = '" + planeType + '\'' +
                ", time = '" + time + '\'' +
                ", weekDays = " + Arrays.toString(weekDays);
    }
}
