package by.epam.bobrikov.stage02.decomposition;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
 * надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
 */
public class Task17 {
    public int taskCalculation(int n) {
        int counter = 0;
        while (n > 0) {
            n = subtractSumDigits(n);
            counter++;
        }
        return counter;
    }

    public int subtractSumDigits(int k) {
        int sumDigits = 0;
        for (int i = 0; i < String.valueOf(k).toCharArray().length; i++) {
            int iInt = Character.getNumericValue(String.valueOf(k).toCharArray()[i]);
            sumDigits += iInt;
        }
        return k - sumDigits;
    }
}
