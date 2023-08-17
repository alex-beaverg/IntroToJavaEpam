package by.epam.bobrikov.stage04.simple_classes.task_classes;

public class Test1 {
    private int number1;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void print() {
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }

    public int sum() {
        return number1 + number2;
    }

    public int max() {
        return Math.max(number1, number2);
    }
}
