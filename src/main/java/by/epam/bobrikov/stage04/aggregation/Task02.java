package by.epam.bobrikov.stage04.aggregation;

import by.epam.bobrikov.stage04.aggregation.task_classes.Car;
import by.epam.bobrikov.stage04.aggregation.task_classes.Engine;
import by.epam.bobrikov.stage04.aggregation.task_classes.Wheel;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля
 */
public class Task02 {
    public void taskCalculation() {
        Wheel wheelSummer16_1 = new Wheel("Summer", 16);
        Wheel wheelSummer16_2 = new Wheel("Summer", 16);
        Wheel wheelSummer16_3 = new Wheel("Summer", 16);
        Wheel wheelSummer16_4 = new Wheel("Summer", 16);
        Wheel wheelWinter17_1 = new Wheel("Winter", 17);
        Wheel wheelSummer16_5 = new Wheel("Summer", 16);
        Wheel wheelSummer16_6 = new Wheel("Summer", 16);

        Engine engine = new Engine(150, 2.2, "Inline 4");

        Car car = new Car("Volvo", "Hatchback", 60, 8);
        car.addEngine(engine);
        car.addWheel(wheelSummer16_1);
        car.addWheel(wheelSummer16_2);
        car.addWheel(wheelSummer16_3);
        car.addWheel(wheelWinter17_1);
        System.out.println("Add 3 good wheels and 1 bad wheel:\n" + car.getWheels());

        car.addWheel(wheelSummer16_4);
        System.out.println("Add 4 good wheels:\n" + car.getWheels());

        car.changeWheel(1,wheelSummer16_5);
        System.out.println("Change wheel number 1:\n" + car.getWheels());

        car.addWheel(wheelSummer16_6);
        System.out.println("Add 5th wheel:\n" + car.getWheels());

        car.move(50);
        System.out.println("Try to move 50 km with empty gas tank. Total distance = " + car.getTotalDistance());

        car.addGas(15);
        System.out.println("Try to add 15 liters of fuel. Gas Level = " + car.getGasLevel());

        car.addGas(100);
        System.out.println("Try to add 100 liters of fuel. Gas Level = " + car.getGasLevel());

        car.move(200);
        System.out.println("Try to move 200 km: " +
                "\nTotal distance = " + car.getTotalDistance() +
                "\nGas level = " + car.getGasLevel());

        car.printName();

        System.out.println("My car: " + car);
    }
}
