package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.DecimalCounter;

/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
 * в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса
 */
public class Task05 {
    public void taskCalculation() {
        DecimalCounter randomStartCounter = new DecimalCounter();
        System.out.println("Random Start Counter:");
        System.out.println("Current number: " + randomStartCounter.getNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());
        System.out.println("Increase number: " + randomStartCounter.increaseNumber());

        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());
        System.out.println("Decrease number: " + randomStartCounter.decreaseNumber());

        DecimalCounter start7Counter = new DecimalCounter(7);
        System.out.println("Start 7 counter:");
        System.out.println("Current number: " + start7Counter.getNumber());
        System.out.println("Increase number: " + start7Counter.increaseNumber());
        System.out.println("Increase number: " + start7Counter.increaseNumber());
        System.out.println("Increase number: " + start7Counter.increaseNumber());
        System.out.println("Increase number: " + start7Counter.increaseNumber());

        System.out.println("Decrease number: " + start7Counter.decreaseNumber());
        System.out.println("Decrease number: " + start7Counter.decreaseNumber());
        System.out.println("Decrease number: " + start7Counter.decreaseNumber());
        System.out.println("Decrease number: " + start7Counter.decreaseNumber());
    }
}
