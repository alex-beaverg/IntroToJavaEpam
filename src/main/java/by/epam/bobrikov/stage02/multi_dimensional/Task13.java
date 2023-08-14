package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов
 */
public class Task13 {
    public List<List<List<Integer>>> taskCalculation(int[][] matrix) {
        List<List<List<Integer>>> result = new ArrayList<>();
        int[][] matrixTurned = turn(matrix);
        int[][] matrixTurnedSorted = sortRows(matrixTurned, false);
        int[][] matrixSorted = turn(matrixTurnedSorted);
        result.add(arrayToList(matrixSorted));
        int[][] matrixTurnedSortedReverse = sortRows(matrixTurned, true);
        int[][] matrixSortedReverse = turn(matrixTurnedSortedReverse);
        result.add(arrayToList(matrixSortedReverse));
        return result;
    }

    public int[][] turn(int[][] matrix) {
        int[][] matrixTurned = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixTurned[j][i] = matrix[i][j];
            }
        }
        return matrixTurned;
    }

    public int[][] sortRows(int[][] matrix, boolean reverse) {
        int[][] matrixTurnedSorted = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                rows.add(matrix[i][j]);
            }
            if (!reverse) {
                Collections.sort(rows);
            } else {
                rows.sort(Collections.reverseOrder());
            }
            for (int j = 0; j < matrix[0].length; j++) {
                matrixTurnedSorted[i][j] = rows.get(j);
            }
        }
        return matrixTurnedSorted;
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
