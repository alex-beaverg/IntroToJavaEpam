package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */
public class Task03 {
    public List<List<Integer>> taskCalculation(int[][] array, int numK, int numP) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> column = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            List<Integer> row = new ArrayList<>();
            if (i == numK) {
                for (int j = 0; j < array[0].length; j++) {
                    row.add(array[i][j]);
                }
                result.add(row);
            }
            for (int j = 0; j < array[0].length; j++) {
                if (j == numP) {
                    column.add(array[i][j]);
                }
            }
        }
        result.add(column);
        return result;
    }
}
