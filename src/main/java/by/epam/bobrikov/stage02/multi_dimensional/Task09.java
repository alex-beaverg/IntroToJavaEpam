package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму
 */
public class Task09 {
    public List<Object> taskCalculation(int[][] matrix) {
        List<Object> result = new ArrayList<>();
        Map<Integer, Integer> sumColumns = new HashMap<>();
        int maxColumn = 0;
        int indexMaxColumn = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (!sumColumns.containsKey(j)) {
                    sumColumns.put(j, matrix[i][j]);
                } else {
                    sumColumns.put(j, sumColumns.get(j) + matrix[i][j]);
                }
            }
            if (i == matrix.length - 1) {
                for (Map.Entry<Integer, Integer> entry: sumColumns.entrySet()) {
                    if (entry.getValue() > maxColumn) {
                        maxColumn = entry.getValue();
                        indexMaxColumn = entry.getKey();
                    }
                }
            }
        }
        result.add(sumColumns);
        result.add(indexMaxColumn);
        return result;
    }
}
