package by.epam.bobrikov.stage02.one_dim_sorts;

import java.util.ArrayList;
import java.util.List;

/**
 * Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 * Мое пояснение: позиция текущего вставляемого элемента определяется с учетом уже вставленных до этого элементов
 */
public class Task07 {
    public List<Integer> taskCalculation(Integer[] array1, Integer[] array2) {
        List<Integer> resultArray = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        int k = 0;
        boolean lastI = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = k; j < array2.length; j++) {
                if (array2[j] <= array1[i]) {
                    resultArray.add(array2[j]);
                    indexes.add(resultArray.size() - 1);
                    k++;
                } else {
                    if (i == array1.length - 1) {
                        if (!lastI) {
                            resultArray.add(array1[i]);
                            lastI = true;
                        }
                        resultArray.add(array2[j]);
                        indexes.add(resultArray.size() - 1);
                        k++;
                    } else {
                        resultArray.add(array1[i]);
                        break;
                    }
                }
            }
        }
        return indexes;
    }
}
