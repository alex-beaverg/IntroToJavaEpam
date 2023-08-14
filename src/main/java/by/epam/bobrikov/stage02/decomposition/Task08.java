package by.epam.bobrikov.stage02.decomposition;

/**
 * Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
 * Пояснение: Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
 * с номерами от k до m
 */
public class Task08 {
    public int taskCalculation(int[] array, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += array[i];
        }
        return sum;
    }
}
