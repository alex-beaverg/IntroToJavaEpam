package by.epam.bobrikov.stage02.one_dimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дана последовательность целых чисел a1, a2, ..., an. Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1, a2, ..., an)
 */
public class Task08 {
    public List<Integer> taskCalculation(int[] array) {
        int[] newArray = new int[array.length];
        List<Integer> result = new ArrayList<>();
        System.arraycopy(array, 0, newArray, 0, array.length);
        Arrays.sort(array);
        int min = array[0];
        for (int element: newArray) {
            if (element != min) {
                result.add(element);
            }
        }
        return result;
    }
}
