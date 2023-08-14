package by.epam.bobrikov.stage02.decomposition;

import java.util.ArrayList;
import java.util.List;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
 * (например, 1234, 5789). Для решения задачи использовать декомпозицию
 */
public class Task15 {
    public Integer[] taskCalculation(int n) {
        List<Integer> increaseNumbers = new ArrayList<>();
        for (int i = (int)Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (isIncreaseNumber(i)) {
                increaseNumbers.add(i);
            }
        }
        return increaseNumbers.toArray(new Integer[0]);
    }

    public boolean isIncreaseNumber(int k) {
        int counter = 0;
        for (int i = 0; i < String.valueOf(k).toCharArray().length - 1; i++) {
            int iInt = Character.getNumericValue(String.valueOf(k).toCharArray()[i]);
            int iInt2 = Character.getNumericValue(String.valueOf(k).toCharArray()[i + 1]);
            if (iInt2 - iInt == 1) {
                counter++;
            }
        }
        return counter == String.valueOf(k).toCharArray().length - 1;
    }
}
