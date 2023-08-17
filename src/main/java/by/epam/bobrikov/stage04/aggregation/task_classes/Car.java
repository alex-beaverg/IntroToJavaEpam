package by.epam.bobrikov.stage04.aggregation.task_classes;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private String type;
    private int gasTankMaxLevel;
    private int gasLevel;
    private int fuelConsumption;
    private Engine engine;
    private List<Wheel> wheels;
    private int totalDistance;

    public Car(String name, String type, int gasTankMaxLevel, int fuelConsumption) {
        this.name = name;
        this.type = type;
        this.gasTankMaxLevel = gasTankMaxLevel;
        this.gasLevel = 0;
        this.fuelConsumption = fuelConsumption;
        this.wheels = new ArrayList<>();
        this.totalDistance = 0;
    }

    public void addWheel(Wheel wheel) {
        if (wheels.size() < 4) {
            if (wheels.size() == 0) {
                wheels.add(wheel);
            } else if (wheels.get(0).getType().equals(wheel.getType()) &&
                    wheels.get(0).getRadius() == wheel.getRadius()) {
                wheels.add(wheel);
            }
        }
    }

    public void changeWheel(int number, Wheel wheel) {
        if (wheels.size() == 4) {
            if (wheels.get(number - 1).getType().equals(wheel.getType()) &&
                    wheels.get(number - 1).getRadius() == wheel.getRadius()) {
                wheels.remove(number - 1);
                wheels.add(number - 1, wheel);
            }
        }
    }

    public void addEngine(Engine engine) {
        this.engine = engine;
    }

    public void printName() {
        System.out.println("Name of car: " + name);
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void addGas(int value) {
        gasLevel += value;
        if (gasLevel > gasTankMaxLevel) {
            gasLevel = gasTankMaxLevel;
        }
    }

    public void move(int distance) {
        if (wheels.size() == 4 && gasLevel > 0) {
            int deltaGasLevel = fuelConsumption * distance / 100;
            if (deltaGasLevel <= gasLevel) {
                gasLevel -= deltaGasLevel;
                totalDistance += distance;
            } else {
                totalDistance += gasLevel * 100 / fuelConsumption;
                gasLevel = 0;
            }
        }
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public int getGasLevel() {
        return gasLevel;
    }

    @Override
    public String toString() {
        return "Car: " +
                "name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                ", gasTankMaxLevel = " + gasTankMaxLevel +
                ", gasLevel = " + gasLevel +
                ", fuelConsumption = " + fuelConsumption +
                ", " + engine +
                ", wheels = " + wheels +
                ", totalDistance = " + totalDistance;
    }
}
