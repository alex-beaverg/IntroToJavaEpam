package by.epam.bobrikov.stage04.aggregation.task_classes;

public class Engine {
    private int capacity;
    private double volume;
    private String type;

    public Engine(int capacity, double volume, String type) {
        this.capacity = capacity;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine: capacity = " + capacity +
                ", volume = " + volume +
                ", type = '" + type + '\'';
    }
}
