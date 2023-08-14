package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */
public class Task01 {
    public List<List<Integer>> taskCalculation(int[][] array) {
        int[][] newArray = new int[array[0].length / 2][array.length];
        for (int i = 0; i < array.length; i++) {
            int x = 0;
            for (int j = 0; j < array[0].length; j++) {
                if (j % 2 == 1) {
                    newArray[x][i] = array[i][j];
                    x++;
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int[] ints : newArray) {
            List<Integer> temp = new ArrayList<>();
            if (ints[0] > ints[newArray[0].length - 1]) {
                for (int element: ints) {
                    temp.add(element);
                }
                result.add(temp);
            }
        }
        return result;
    }
}
