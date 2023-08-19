package by.epam.bobrikov.stage05.Task05;

import by.epam.bobrikov.stage05.Task05.Task05A.FlowerComposition;
import by.epam.bobrikov.stage05.Task05.Task05B.Present;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Корректно спроектируйте и реализуйте предметную область задачи.
 * • Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
 * • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * • для проверки корректности переданных данных можно применить регулярные выражения.
 * • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 * Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции (объект,
 * представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.
 * Вариант Б. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
 * Составляющими целого подарка являются сладости и упаковка
 */
public class Task05Actions {
    public void taskCalculation05A(){
        FlowerComposition composition = FlowerComposition.getInstance();
        composition.createDecoration("FLOWER");
        composition.createDecoration("flower");
        composition.createDecoration("flower");
        composition.createDecoration("flower");
        composition.createDecoration("flower");
        composition.createDecoration("flower");
        composition.createDecoration("PACK");
        composition.createDecoration("pack");
        composition.createDecoration("pack");
        composition.printComposition();
    }

    public void taskCalculation05B(){
        Present present = Present.getInstance();
        present.createComponent("SWEET");
        present.createComponent("sweet");
        present.createComponent("sweet");
        present.createComponent("sweet");
        present.createComponent("sweet");
        present.createComponent("sweet");
        present.createComponent("PACK");
        present.createComponent("pack");
        present.printPresent();
    }
}
