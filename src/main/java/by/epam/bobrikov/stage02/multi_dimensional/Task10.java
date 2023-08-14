package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы
 */
public class Task10 {
    public List<Integer> taskCalculation(int[][] matrix) {
        List<Integer> positive = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    if (matrix[i][j] > 0) {
                        positive.add(matrix[i][j]);
                    }
                }
            }
        }
        return positive;
    }
}
