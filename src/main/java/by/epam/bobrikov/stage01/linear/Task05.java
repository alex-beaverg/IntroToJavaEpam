package by.epam.bobrikov.stage01.linear;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc
 */
public class Task05 {
    public String taskCalculation(int timeInSeconds) {
        String hours = String.format("%02d", timeInSeconds / 3600) + "h ";
        String minutes = String.format("%02d", timeInSeconds % 3600 / 60) + "min ";
        String seconds = String.format("%02d", timeInSeconds % 3600 % 60) + "sec";
        return hours + minutes + seconds;
    }
}
