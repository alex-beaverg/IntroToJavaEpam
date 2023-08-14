package by.epam.bobrikov.stage02.one_dim_sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Сортировка обменами. Дана последовательность чисел a1, a2, ..., an.Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai и a(i+1). Если ai > a(i+1), то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок
 */
public class Task04 {
    public List<Object> taskCalculation(Integer[] array) {
        int moves = 0;
        int j = 0;
        while (j < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    moves++;
                    int x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                }
            }
            j++;
        }
        List<Object> result = new ArrayList<>();
        result.add(new ArrayList<>(Arrays.asList(array)));
        result.add(moves);
        return result;
    }
}
