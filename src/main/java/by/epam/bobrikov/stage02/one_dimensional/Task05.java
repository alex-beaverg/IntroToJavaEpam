package by.epam.bobrikov.stage02.one_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Даны целые числа а1 ,а2, ..., аn. Вывести на печать только те числа, для которых аi > i
 */
public class Task05 {
    public List<Integer> taskCalculation(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                result.add(array[i]);
            }
        }
        return result;
    }
}
