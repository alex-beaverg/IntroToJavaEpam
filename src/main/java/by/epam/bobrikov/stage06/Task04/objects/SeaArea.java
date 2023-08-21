package by.epam.bobrikov.stage06.Task04.objects;

import java.util.ArrayList;
import java.util.List;

public class SeaArea {
    public static List<Ship> ships = new ArrayList<>();

    public SeaArea() {
        Ship ship1 = new Ship(10);
        ship1.setName("Ship-1");
        ships.add(ship1);
        ship1.start();
        Ship ship2 = new Ship(0);
        ship2.setName("Ship-2");
        ships.add(ship2);
        ship2.start();
        Ship ship3 = new Ship(10);
        ship3.setName("Ship-3");
        ships.add(ship3);
        ship3.start();
        Ship ship4 = new Ship(0);
        ship4.setName("Ship-4");
        ships.add(ship4);
        ship4.start();
        Ship ship5 = new Ship(10);
        ship5.setName("Ship-5");
        ships.add(ship5);
        ship5.start();
        Ship ship6 = new Ship(0);
        ship6.setName("Ship-6");
        ships.add(ship6);
        ship6.start();
        Ship ship7 = new Ship(10);
        ship7.setName("Ship-7");
        ships.add(ship7);
        ship7.start();
        Ship ship8 = new Ship(0);
        ship8.setName("Ship-8");
        ships.add(ship8);
        ship8.start();
        Ship ship9 = new Ship(10);
        ship9.setName("Ship-9");
        ships.add(ship9);
        ship9.start();
        Ship ship10 = new Ship(0);
        ship10.setName("Ship-10");
        ships.add(ship10);
        ship10.start();
    }

    public static synchronized void deleteShip(Ship ship) {
        ships.remove(ship);
    }

    public static synchronized void addShip(Ship ship) {
        System.out.println(Ship.currentThread().getName() + " sailed into the Sea Area");
        ships.add(ship);
    }
}
