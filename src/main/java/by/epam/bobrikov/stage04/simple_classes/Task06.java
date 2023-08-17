package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.SetTime;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
 * отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
 * полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов,
 * минут и секунд
 */
public class Task06 {
    public void taskCalculation() {
        SetTime time = new SetTime();

        time.printCurrentTime();
        time.setHours(33);
        System.out.print("Time after set hours = 33: ");
        time.printCurrentTime();

        time.setHours(13);
        System.out.print("Time after set hours = 13: ");
        time.printCurrentTime();

        time.setMinutes(73);
        System.out.print("Time after set hours = 73: ");
        time.printCurrentTime();

        time.setMinutes(43);
        System.out.print("Time after set hours = 43: ");
        time.printCurrentTime();

        time.setSeconds(93);
        System.out.print("Time after set hours = 93: ");
        time.printCurrentTime();

        time.setSeconds(23);
        System.out.print("Time after set hours = 23: ");
        time.printCurrentTime();

        time.setAllTime(25, 94, 102);
        System.out.print("Time after set all time = 25:94:102: ");
        time.printCurrentTime();

        time.setAllTime(20, 44, 59);
        System.out.print("Time after set all time = 20:44:59: ");
        time.printCurrentTime();
    }
}
