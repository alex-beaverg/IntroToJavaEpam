package by.epam.bobrikov.stage04.aggregation.task_classes;

public class City {
    private String name;
    private boolean isCapital;
    private boolean isRegionCenter;

    public City(String name, boolean isCapital, boolean isRegionCenter) {
        this.name = name;
        this.isCapital = isCapital;
        this.isRegionCenter = isRegionCenter;
    }

    public String getName() {
        return name;
    }
}
