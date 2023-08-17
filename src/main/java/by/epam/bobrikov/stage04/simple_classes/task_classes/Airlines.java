package by.epam.bobrikov.stage04.simple_classes.task_classes;

import java.util.ArrayList;
import java.util.List;

public class Airlines {
    List<Airline> airlines;

    public Airlines() {
        this.airlines = new ArrayList<>();
    }

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    public List<Airline> airlinesByDestination(String destination) {
        List<Airline> newAirlineList = new ArrayList<>();
        for (Airline airline: airlines) {
            if (airline.getDestination().equals(destination)) {
                newAirlineList.add(airline);
            }
        }
        return newAirlineList;
    }

    public List<Airline> airlinesByWeekday(String day) {
        List<Airline> newAirlineList = new ArrayList<>();
        for (Airline airline: airlines) {
            for (String weekDay: airline.getWeekDays()) {
                if (weekDay.equals(day)) {
                    newAirlineList.add(airline);
                }
            }
        }
        return newAirlineList;
    }

    public List<Airline> airlinesByWeekdayAfterTime(String day, String time) {
        List<Airline> newAirlineList = new ArrayList<>();
        for (Airline airline: airlines) {
            for (String weekDay: airline.getWeekDays()) {
                if (weekDay.equals(day) && Integer.parseInt(airline.getTime().split(":")[0]) >
                        Integer.parseInt(time.split(":")[0])) {
                    newAirlineList.add(airline);
                }
            }
        }
        return newAirlineList;
    }

    @Override
    public String toString() {
        return "Airlines: " + airlines;
    }
}
