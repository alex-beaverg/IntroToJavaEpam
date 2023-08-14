package by.epam.bobrikov.stage02.one_dim_sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k -м и (k+1) -м элементами первого, при этом не используя
 * дополнительный массив
 */
public class Task01 {
    public Integer[] taskCalculation(Integer[] array1, int[] array2, int numK) {
        List<Integer> temp = new ArrayList<>(Arrays.asList(array1));
        for (int i = 0; i < array2.length; i++) {
            temp.add(i + numK + 1, array2[i]);
        }
        return temp.toArray(new Integer[0]);
    }
}
