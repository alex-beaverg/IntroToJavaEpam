package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */
public class Task02 {
    public List<Integer> taskCalculation(int[][] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    result.add(array[i][j]);
                }
            }
        }
        return result;
    }
}
