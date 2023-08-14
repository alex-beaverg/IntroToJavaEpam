package by.epam.bobrikov.stage02.one_dim_sorts;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и a(i+1). Если ai <= a(i+1), то продвигаются
 * на один элемент вперед. Если ai > a(i+1), то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки
 */
public class Task06 {
    public int[] taskCalculation(int[] array) {
        int len = array.length;
        for (int step = len / 2; step > 0; step /= 2) {
            for (int i = step; i < len; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
        return array;
    }
}
