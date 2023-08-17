package by.epam.bobrikov.stage04.simple_classes.task_classes;

import java.util.Random;

public class DecimalCounter {
    private int number;

    public DecimalCounter() {
        this.number = new Random().nextInt(10);
    }

    public DecimalCounter(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int increaseNumber() {
        if (number == 9) {
            number = 0;
        } else {
            number++;
        }
        return number;
    }

    public int decreaseNumber() {
        if (number == 0) {
            number = 9;
        } else {
            number--;
        }
        return number;
    }
}
