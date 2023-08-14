package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      {1 1 1 ... 1 1 1}
 *      {0 1 1 ... 1 1 0}
 *      {0 0 1 ... 1 0 0}
 *      {. . . ... . . .}
 *      {0 1 1 ... 1 1 0}
 *      {1 1 1 ... 1 1 1}
 */
public class Task06 {
    public List<List<Integer>> taskCalculation(int numN) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numN; i++) {
            List<Integer> subResult = new ArrayList<>();
            for (int j = 1; j <= numN; j++) {
                if (i <= j && i <= numN / 2 && j < numN + 2 - i || i >= j && i > numN / 2 && j > numN - i) {
                    subResult.add(1);
                } else {
                    subResult.add(0);
                }
            }
            result.add(subResult);
        }
        return result;
    }
}
