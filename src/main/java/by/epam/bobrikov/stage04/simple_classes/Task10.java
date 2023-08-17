package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.Airline;
import by.epam.bobrikov.stage04.simple_classes.task_classes.Airlines;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного
 */
public class Task10 {
    public void taskCalculation() {
        Airline airline1 = new Airline("Oslo", 6225, "Boing 747", "15:25",
                new String[]{"Wednesday", "Friday"});
        Airline airline2 = new Airline("Paris", 7252, "Boing 737", "5:40",
                new String[]{"Monday", "Friday"});
        Airline airline3 = new Airline("London", 2364, "Boing 737", "19:20",
                new String[]{"Sunday", "Monday"});
        Airline airline4 = new Airline("Oslo", 6229, "Boing 767", "13:10",
                new String[]{"Wednesday", "Thursday", "Friday"});
        Airline airline5 = new Airline("Berlin", 3322, "Boing 747", "16:55",
                new String[]{"Sunday", "Monday", "Friday"});

        Airlines airlines = new Airlines();
        airlines.addAirline(airline1);
        airlines.addAirline(airline2);
        airlines.addAirline(airline3);
        airlines.addAirline(airline4);
        airlines.addAirline(airline5);

        System.out.print("Airlines by destination Oslo: \nAirlines: ");
        System.out.println(airlines.airlinesByDestination("Oslo"));
        System.out.println();

        System.out.print("Airlines by weekday Friday: \nAirlines: ");
        System.out.println(airlines.airlinesByWeekday("Friday"));
        System.out.println();

        System.out.print("Airlines by weekday Friday and with time after 12:00: \nAirlines: ");
        System.out.println(airlines.airlinesByWeekdayAfterTime("Friday", "12:00"));
    }
}
