package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Сформировать случайную матрицу (m * n), состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца
 * (логично, что для этого должно быть m >= n)
 */
public class Task14 {
    public List<List<Integer>> taskCalculation(int numM, int numN) {
        int[][] matrix = new int[numM][numN];
        for (int i = 0; i < numN; i++) {
            int counter = 0;
            for (int j = 0; j < numM; j++) {
                Random random = new Random();
                int cell = random.nextInt(2);
                if (counter < i) {
                    if (numM - 1 - i < j) {
                        matrix[j][i] = 1;
                        counter++;
                    } else {
                        matrix[j][i] = cell;
                        if (cell == 1) {
                            counter++;
                        }
                    }
                } else {
                    matrix[j][i] = 0;
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
