package by.epam.bobrikov.stage05.Task03;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Holiday> holidays;

    public Calendar() {
        this.holidays = new ArrayList<>();
    }

    public void printCalendar() {
        System.out.println("Holidays");
        System.out.println("- - - -");
        for (Calendar.Holiday holiday: holidays) {
            System.out.println(holiday);
        }
        System.out.println("- - - -");
        System.out.println("Quantity: " + holidays.size());
    }

    public class Holiday {
        private String date;
        private String name;

        public Holiday(String date, String name) {
            this.date = date;
            this.name = name;
            Calendar.this.holidays.add(this);
        }

        @Override
        public String toString() {
            return date + ": " + name;
        }
    }
}
