package by.epam.bobrikov.stage02.multi_dimensional;

import java.util.ArrayList;
import java.util.List;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      { 1   1  1 ... 1 1 1}
 *      { 2   2  2 ... 2 2 0}
 *      { 3   3  3 ... 3 0 0}
 *      { .   .  . ... . . .}
 *      {n-1 n-1 0 ... 0 0 0}
 *      { n   0  0 ... 0 0 0}
 */
public class Task05 {
    public List<List<Integer>> taskCalculation(int numN) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numN; i++) {
            List<Integer> subResult = new ArrayList<>();
            for (int j = 1; j <= numN; j++) {
                if (j <= numN - i + 1) {
                    subResult.add(i);
                } else {
                    subResult.add(0);
                }
            }
            result.add(subResult);
        }
        return result;
    }
}
