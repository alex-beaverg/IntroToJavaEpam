package by.epam.bobrikov.stage06.Task04.objects;

import java.util.ArrayList;
import java.util.List;

public class Port {
    private static int containers = 100;
    private static List<Ship> ships = new ArrayList<>();

    public static synchronized void addShipToPort(Ship ship) {
        System.out.println(Ship.currentThread().getName() + " entered to the port");
        ships.add(ship);
        SeaArea.deleteShip(ship);
    }

    public static synchronized void deleteShipFromPort(Ship ship) {
        System.out.println(Ship.currentThread().getName() + " escaped from the port");
        ships.remove(ship);
        SeaArea.addShip(ship);
    }

    public synchronized static void loadPort() {
        containers++;
    }

    public synchronized static void unloadPort() {
        containers--;
    }
}
