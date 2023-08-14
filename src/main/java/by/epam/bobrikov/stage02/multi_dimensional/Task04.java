package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      {1  2   3  ... n}
 *      {n n-1 n-2 ... 1}
 *      {1  2   3  ... n}
 *      {n n-1 n-2 ... 1}
 *      {.  .   .  ... .}
 *      {n n-1 n-2 ... 1}
 */
public class Task04 {
    public List<List<Integer>> taskCalculation(int numN) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numN; i++) {
            List<Integer> subResult = new ArrayList<>();
            if (i % 2 != 0) {
                for (int j = 1; j <= numN; j++) {
                    subResult.add(j);
                }
            } else {
                for (int j = numN; j > 0; j--) {
                    subResult.add(j);
                }
            }
            result.add(subResult);
        }
        return result;
    }
}
