package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.Train;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
 * данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность
 * сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены
 * по времени отправления
 */
public class Task04 {
    public void taskCalculation() {
        Train[] trains = new Train[]{
                new Train("Seattle", 2415, "17:53"),
                new Train("Los Angeles", 1526, "9:00"),
                new Train("New York", 4366, "12:45"),
                new Train("Seattle", 2419, "5:35"),
                new Train("Portland", 3321, "17:20")
        };

        System.out.println("Trains sorted by number:");
        printTrains(sortByTrainNumber(trains));
        System.out.println();

        System.out.println("Train by number (4366):");
        printTrainByNumber(trains, 4366);
        System.out.println();

        System.out.println("Trains sorted by destination:");
        printTrains(sortByDestination(trains));
    }

    public Train[] sortByTrainNumber(Train[] trains) {
        int j;
        for (int i = 1; i < trains.length; i++) {
            int x = trains[i].getTrainNumber();
            Train xX = trains[i];
            for (j = i; j > 0 && x < trains[j - 1].getTrainNumber(); j--) {
                trains[j] = trains[j - 1];
            }
            trains[j] = xX;
        }
        return trains;
    }

    public void printTrains(Train[] trains) {
        for (Train train: trains) {
            System.out.println("Train N:" + train.getTrainNumber() + ", " + train.getDestination() +
                    ", " + train.getTime());
        }
    }

    public void printTrainByNumber(Train[] trains, int number) {
        for (Train train: trains) {
            if (train.getTrainNumber() == number) {
                System.out.println("Train N:" + train.getTrainNumber() + ", " + train.getDestination() +
                        ", " + train.getTime());
            }
        }
    }

    public Train[] sortByDestination(Train[] trains) {
        int j;
        for (int i = 1; i < trains.length; i++) {
            String x = trains[i].getDestination();
            String time = trains[i].getTime();
            Train xX = trains[i];
            for (j = i; j > 0 && x.compareTo(trains[j - 1].getDestination()) < 0 ||
                    j > 0 && x.compareTo(trains[j - 1].getDestination()) == 0 &&
                            Integer.parseInt(time.split(":")[0]) <
                                    Integer.parseInt(trains[j - 1].getTime().split(":")[0]); j--) {
                trains[j] = trains[j - 1];
            }
            trains[j] = xX;
        }
        return trains;
    }
}
