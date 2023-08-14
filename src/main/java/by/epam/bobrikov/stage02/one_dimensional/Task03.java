package by.epam.bobrikov.stage02.one_dimensional;

import java.util.HashMap;
import java.util.Map;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов
 */
public class Task03 {
    public Map<String, Integer> taskCalculation(int[] array) {
        Map<String, Integer> result = new HashMap<>();
        result.put("Negative", 0);
        result.put("Positive", 0);
        result.put("Zero", 0);
        for (int number: array) {
            if (number < 0) {
                result.put("Negative", result.get("Negative") + 1);
            } else if (number > 0) {
                result.put("Positive", result.get("Positive") + 1);
            } else {
                result.put("Zero", result.get("Zero") + 1);
            }
        }
        return result;
    }
}
