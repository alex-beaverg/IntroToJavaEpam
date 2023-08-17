package by.epam.bobrikov.stage04.aggregation.task_classes;

public class TravelPackage {
    private int id;
    private String type;
    private String transport;
    private int days;
    private String food;

    public TravelPackage(String type, String transport, int days, String food) {
        this.id = Integer
                .parseInt(String.valueOf(hashCode()).substring(String.valueOf(hashCode()).length() - 4));
        this.type = type;
        this.transport = transport;
        this.days = days;
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTransport() {
        return transport;
    }

    public int getDays() {
        return days;
    }

    public String getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "\nTravel package: " +
                "id = " + id +
                ", type = '" + type + '\'' +
                ", transport = '" + transport + '\'' +
                ", days = " + days +
                ", food = '" + food + '\'';
    }
}
