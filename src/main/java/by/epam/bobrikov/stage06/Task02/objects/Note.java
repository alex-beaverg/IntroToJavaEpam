package by.epam.bobrikov.stage06.Task02.objects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Note {
    private String title;
    private String date;
    private String email;
    private String text;

    public Note(String title, String date, String email, String text) {
        this.title = title;
        this.date = date;
        this.email = email;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public Calendar getCalendarDate() {
        String[] items = date.split("\\.");
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, Integer.parseInt(items[2]));
        calendar.set(Calendar.MONTH, Integer.parseInt(items[1]));
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(items[0]));
        return calendar;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Note: title (" + title + "), date (" + date + "), email (" + email + "), text (" + text + ")";
    }
}
