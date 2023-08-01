package by.epam.bobrikov.stage01.cycles;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 * a(n) = 1 / 2**n + 1 / 3**n
 */
public class Task05 {
    public double taskCalculation(int[] array, int number) {
        double result = 0;
        for (int i = array[0]; i <= array[1]; i++) {
            double rowItem = Math.abs(1 / Math.pow(2, i) + 1 / Math.pow(3, i));
            if (rowItem >= number) {
                result += rowItem;
            }
        }
        return result;
    }
}
