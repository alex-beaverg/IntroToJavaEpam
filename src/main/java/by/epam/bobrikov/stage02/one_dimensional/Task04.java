package by.epam.bobrikov.stage02.one_dimensional;

import java.util.Arrays;

/**
 * Даны действительные числа а1, а2, ..., аn. Поменять местами наибольший и наименьший элементы
 */
public class Task04 {
    public int[] taskCalculation(int[] array) {
        int[] changedArray = new int[array.length];
        System.arraycopy(array, 0, changedArray, 0, array.length);
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];
        for (int i = 0; i < changedArray.length; i++) {
            if (changedArray[i] == min) {
                changedArray[i] = max;
            } else if (changedArray[i] == max) {
                changedArray[i] = min;
            }
        }
        return changedArray;
    }
}
