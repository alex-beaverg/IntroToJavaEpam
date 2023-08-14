package by.epam.bobrikov.stage02.one_dimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дана последовательность действительных чисел а1, а2, ..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен
 */
public class Task02 {
    public List<Object> taskCalculation(int[] array, int numZ) {
        int changesCount = 0;
        int[] changedArray = new int[array.length];
        List<Object> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > numZ) {
                changedArray[i] = numZ;
                changesCount++;
            } else {
                changedArray[i] = array[i];
            }
        }
        result.add(Arrays.toString(changedArray));
        result.add(changesCount);
        return result;
    }
}
