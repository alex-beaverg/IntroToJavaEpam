package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I**2 - J**2) / N)
 * и подсчитать количество положительных элементов в ней
 */
public class Task07 {
    public List<Object> taskCalculation(int numN) {
        List<Object> result = new ArrayList<>();
        List<List<Double>> matrix = new ArrayList<>();
        int positives = 0;
        for (int i = 0; i < numN; i++) {
            List<Double> subMatrix = new ArrayList<>();
            for (int j = 0; j < numN; j++) {
                double element = Math.ceil(Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / numN) * 100) / 100;
                subMatrix.add(element);
                if (element > 0) {
                    positives++;
                }
            }
            matrix.add(subMatrix);
        }
        result.add(matrix);
        result.add(positives);
        return result;
    }
}
