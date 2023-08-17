package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.Test1;

/**
 * Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из
 * этих двух переменных
 */
public class Task01 {
    public void taskCalculation() {
        Test1 testObject = new Test1();
        testObject.setNumber1(100);
        testObject.setNumber2(115);
        testObject.print();
        System.out.println("Sum of numbers: " + testObject.sum());
        System.out.println("Max of numbers: " + testObject.max());
    }
}
