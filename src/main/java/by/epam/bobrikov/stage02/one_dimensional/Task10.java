package by.epam.bobrikov.stage02.one_dimensional;

import java.util.Arrays;

/**
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать
 */
public class Task10 {
    public int[] taskCalculation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        return array;
    }
}
