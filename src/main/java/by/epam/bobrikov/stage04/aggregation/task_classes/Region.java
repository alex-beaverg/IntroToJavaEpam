package by.epam.bobrikov.stage04.aggregation.task_classes;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;
    private City regionCenter;
    private List<Area> areas;

    public Region(String name, City regionCenter) {
        this.name = name;
        this.regionCenter = regionCenter;
        this.areas = new ArrayList<>();
    }

    public void addArea(Area area) {
        areas.add(area);
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public List<Area> getAreas() {
        return areas;
    }
}
