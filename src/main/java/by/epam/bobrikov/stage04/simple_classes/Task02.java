package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.Test2;

/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
 * инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса
 */
public class Task02 {
    public void taskCalculation() {
        Test2 testObject1 = new Test2(15, 30);
        Test2 testObject2 = new Test2();
        System.out.println("testObject1, Number 1: " + testObject1.getNumber1());
        System.out.println("testObject1, Number 2: " + testObject1.getNumber2());
        System.out.println("testObject2, Number 1: " + testObject2.getNumber1());
        System.out.println("testObject2, Number 2: " + testObject2.getNumber2());
        testObject2.setNumber1(500);
        testObject2.setNumber2(200);
        System.out.println("testObject2, Number 1 after set: " + testObject2.getNumber1());
        System.out.println("testObject2, Number 2 after set: " + testObject2.getNumber2());
    }
}
