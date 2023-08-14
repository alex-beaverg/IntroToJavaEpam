package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз
 */
public class Task11 {
    public List<Object> taskCalculation(int numN, int numK) {
        List<Object> result = new ArrayList<>();
        int[][] matrix = new int[numN][numK];
        for (int i = 0; i < numN; i++) {
            for (int j = 0; j < numK; j++) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(16);
            }
        }
        List<List<Integer>> newMatrix = new ArrayList<>();
        List<Integer> specialRows = new ArrayList<>();
        for (int i = 0; i < numN; i++) {
            List<Integer> rows = new ArrayList<>();
            int counter = 0;
            for (int j = 0; j < numK; j++) {
                rows.add(matrix[i][j]);
                if (matrix[i][j] % 5 == 0 && matrix[i][j] != 0) {
                    counter++;
                }
            }
            if (counter >= 3) {
                specialRows.add(i);
            }
            newMatrix.add(rows);
        }
        result.add(newMatrix);
        result.add(specialRows);
        return result;
    }
}
