package by.epam.bobrikov.stage02.one_dimensional;

/**
 * В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */
public class Task01 {
    public int taskCalculation(int[] array, int numK) {
        int result = 0;
        for (int element: array) {
            if (element % numK == 0) {
                result += element;
            }
        }
        return result;
    }
}
