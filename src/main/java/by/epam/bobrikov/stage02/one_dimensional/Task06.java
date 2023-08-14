package by.epam.bobrikov.stage02.one_dimensional;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами
 */
public class Task06 {
    public double taskCalculation(double[] array) {
        double result = 0;
        for (int i = 1; i < array.length; i++) {
            if (isSimple(i)) {
                result += array[i];
            }
        }
        return result;
    }

    public boolean isSimple(int number) {
        int divisorCounter = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisorCounter++;
            }
        }
        return divisorCounter == 1;
    }
}
