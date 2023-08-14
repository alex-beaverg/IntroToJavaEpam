package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */
public class Task12 {
    public List<List<List<Integer>>> taskCalculation(int[][] matrix) {
        List<List<List<Integer>>> result = new ArrayList<>();
        List<List<Integer>> matrixSort = new ArrayList<>();
        for (int[] ints : matrix) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                rows.add(ints[j]);
            }
            Collections.sort(rows);
            matrixSort.add(rows);
        }
        result.add(matrixSort);
        List<List<Integer>> matrixSortReverse = new ArrayList<>();
        for (int[] ints : matrix) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                rows.add(ints[j]);
            }
            rows.sort(Collections.reverseOrder());
            matrixSortReverse.add(rows);
        }
        result.add(matrixSortReverse);
        return result;
    }
}
