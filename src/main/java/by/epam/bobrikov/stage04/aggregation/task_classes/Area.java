package by.epam.bobrikov.stage04.aggregation.task_classes;

public class Area {
    private String name;
    private City areaCenter;
    private int square;

    public Area(String name, int square, City areaCenter) {
        this.name = name;
        this.square = square;
        this.areaCenter = areaCenter;
    }

    public int getSquare() {
        return square;
    }
}
