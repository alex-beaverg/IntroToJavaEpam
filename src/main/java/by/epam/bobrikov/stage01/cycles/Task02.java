package by.epam.bobrikov.stage01.cycles;

import java.util.Arrays;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x, если x > 2
 * y = -x, если x <= 2
 */
public class Task02 {
    public String taskCalculation(int[] array, int step) {
        int[] result;
        if ((array[1] - array[0] + 1) % step == 0) {
            result = new int[(array[1] - array[0] + 1) / step];
        } else {
            result = new int[(array[1] - array[0] + 1) / step + 1];
        }
        int j = 0;
        for (int i = array[0]; i <= array[1]; i += step) {
            if (i <= 2) {
                result[j] = -i;
            } else {
                result[j] = i;
            }
            j++;
        }
        return Arrays.toString(result);
    }
}
