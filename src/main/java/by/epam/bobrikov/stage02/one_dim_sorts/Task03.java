package by.epam.bobrikov.stage02.one_dim_sorts;

/**
 * Сортировка выбором. Дана последовательность чисел a1, a2, ..., an.Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором
 */
public class Task03 {
    public int[] taskCalculation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = maxByIndex(array, i)[0];
            int maxValue = maxByIndex(array, i)[1];
            int x = array[i];
            array[i] = maxValue;
            array[maxIndex] = x;
        }
        return array;
    }

    public int[] maxByIndex(int[] array, int index) {
        int maxIndex = index;
        int maxValue = array[maxIndex];
        for (int i = index; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxIndex = i;
                maxValue = array[i];
            }
        }
        int[] maximum = new int[2];
        maximum[0] = maxIndex;
        maximum[1] = maxValue;
        return maximum;
    }
}
