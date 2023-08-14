package by.epam.bobrikov.stage02.one_dimensional;

import java.util.HashMap;
import java.util.Map;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них
 */
public class Task09 {
    public Map<Integer, Integer> taskCalculation(int[] array) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int element: array) {
            if (!numberMap.containsKey(element)) {
                numberMap.put(element, 1);
            } else {
                numberMap.put(element, numberMap.get(element) + 1);
            }
        }
        int maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            } else if (entry.getValue() == maxValue) {
                maxKey = Math.min(maxKey, entry.getKey());
            }
        }
        Map<Integer, Integer> result = new HashMap<>();
        result.put(maxKey, maxValue);
        return result;
    }
}
