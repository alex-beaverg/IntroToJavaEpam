package by.epam.bobrikov.stage06.Task04.objects;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Ship extends Thread {
    private int containers;
    final static Semaphore semaphore = new Semaphore(3);

    public Ship(int containers) {
        this.containers = containers;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            try {
                Port.addShipToPort(this);
                if (containers == 0) {
                    loadShip();
                } else {
                    unloadShip();
                }
                Port.deleteShipFromPort(this);
            } finally {
                semaphore.release();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void loadShip() {
        Random random = new Random();
        System.out.println(Ship.currentThread().getName() + " is loading");
        while (containers < 10) {
            try {
                Thread.sleep((10 - random.nextInt(10)) * 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            containers++;
            Port.unloadPort();
        }
    }

    public synchronized void unloadShip() {
        Random random = new Random();
        System.out.println(Ship.currentThread().getName() + " is unloading");
        while (containers > 0) {
            try {
                Thread.sleep((10 - random.nextInt(10)) * 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            containers--;
            Port.loadPort();
        }
    }
}
