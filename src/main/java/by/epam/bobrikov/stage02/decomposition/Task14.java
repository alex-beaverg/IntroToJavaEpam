package by.epam.bobrikov.stage02.decomposition;

import java.util.ArrayList;
import java.util.List;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенных в
 * степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию
 */
public class Task14 {
    public Integer[] taskCalculation(int k) {
        List<Integer> armstrongNumbers = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            if (isArmstrongNumber(i)) {
                armstrongNumbers.add(i);
            }
        }
        return armstrongNumbers.toArray(new Integer[0]);
    }

    public boolean isArmstrongNumber(int number) {
        int n = String.valueOf(number).toCharArray().length;
        int calculating = 0;
        for (char x: String.valueOf(number).toCharArray()) {
            int xInt = Character.getNumericValue(x);
            calculating += Math.pow(xInt, n);
        }
        return calculating == number;
    }
}
