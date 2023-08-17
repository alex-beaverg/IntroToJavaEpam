package by.epam.bobrikov.stage04.aggregation.task_classes;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private City capital;
    private List<Region> regions;

    public State(String name, City capital) {
        this.name = name;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public void printCapital() {
        System.out.println(capital.getName() + " is the capital of " + name);
    }

    public void printQuantityRegions() {
        System.out.println("Quantity of regions: " + regions.size());
    }

    public void printSquare() {
        int square = 0;
        for (Region region: regions) {
            for (Area area: region.getAreas()) {
                square += area.getSquare();
            }
        }
        System.out.println("State square: " + square);
    }

    public void printRegionCenters() {
        System.out.println("Region centers:");
        for (Region region: regions) {
            System.out.println(region.getRegionCenter().getName());
        }
    }
}
