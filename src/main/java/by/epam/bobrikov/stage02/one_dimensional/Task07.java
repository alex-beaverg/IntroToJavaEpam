package by.epam.bobrikov.stage02.one_dimensional;

import java.util.Arrays;

/**
 * Даны действительные числа a1, a2, ..., an. Найти
 * max(a1 + an, a2 + a(n-1), ...)
 */
public class Task07 {
    public int taskCalculation(int[] array) {
        int count = array.length / 2;
        int[] newArray = new int[count];
        if (array.length % 2 == 1) {
            newArray = new int[count + 1];
        }
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i] + array[array.length - 1 - i];
        }
        if (array.length % 2 == 1) {
            newArray[count] = array[count] * 2;
        }
        Arrays.sort(newArray);
        return newArray[newArray.length - 1];
    }
}
