package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */
public class Task15 {
    public List<List<Integer>> taskCalculation(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 == 1) {
                    matrix[i][j] = max;
                }
            }
        }
        return arrayToList(matrix);
    }

    public List<List<Integer>> arrayToList(int[][] matrix) {
        List<List<Integer>> matrixList = new ArrayList<>();
        for (int[] ints : matrix) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                rows.add(ints[j]);
            }
            matrixList.add(rows);
        }
        return matrixList;
    }
}
