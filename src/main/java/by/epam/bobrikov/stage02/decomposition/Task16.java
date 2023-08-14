package by.epam.bobrikov.stage02.decomposition;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
 * сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию
 */
public class Task16 {
    public int[] taskCalculation(int n) {
        int sumOddNumbers = 0;
        int[] result = new int[2];
        for (int i = (int)Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (containsOddNumbers(i)) {
                sumOddNumbers += i;
            }
        }
        result[0] = sumOddNumbers;
        result[1] = quantityEvenNumbers(sumOddNumbers);
        return result;
    }

    public boolean containsOddNumbers(int k) {
        int counter = 0;
        for (int i = 0; i < String.valueOf(k).toCharArray().length; i++) {
            int iInt = Character.getNumericValue(String.valueOf(k).toCharArray()[i]);
            if (iInt % 2 != 0) {
                counter++;
            }
        }
        return counter == String.valueOf(k).toCharArray().length;
    }

    public int quantityEvenNumbers(int k) {
        int counter = 0;
        for (int i = 0; i < String.valueOf(k).toCharArray().length; i++) {
            int iInt = Character.getNumericValue(String.valueOf(k).toCharArray()[i]);
            if (iInt % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
