package by.epam.bobrikov.stage02.one_dim_sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bn. Образовать из них новую
 * последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание: дополнительный массив не использовать
 */
public class Task02 {
    public Integer[] taskCalculation(Integer[] array1, int[] array2) {
        List<Integer> temp = new ArrayList<>(Arrays.asList(array1));
        for (int j : array2) {
            temp.add(j);
        }
        Collections.sort(temp);
        return temp.toArray(new Integer[0]);
    }
}
