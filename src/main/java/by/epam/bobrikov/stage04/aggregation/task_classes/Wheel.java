package by.epam.bobrikov.stage04.aggregation.task_classes;

public class Wheel {
    private int id;
    private String type;
    private int radius;

    public Wheel(String type, int radius) {
        this.id = hashCode();
        this.type = type;
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Wheel: " +
                "id = " + id +
                ", type = '" + type + '\'' +
                ", radius = " + radius;
    }
}
