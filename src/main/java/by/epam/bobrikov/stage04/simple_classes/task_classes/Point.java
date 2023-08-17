package by.epam.bobrikov.stage04.simple_classes.task_classes;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String showPoint() {
        return "(" + x + ", " + y + ")";
    }
}
