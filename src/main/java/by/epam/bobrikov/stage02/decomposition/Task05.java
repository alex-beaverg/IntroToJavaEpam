package by.epam.bobrikov.stage02.decomposition;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов)
 */
public class Task05 {
    public int taskCalculation(int[] array) {
        return sort(array)[array.length - 2];
    }

    public int[] sort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            for (j = i; j > 0 && x < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = x;
        }
        return array;
    }
}
