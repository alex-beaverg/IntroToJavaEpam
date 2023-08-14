package by.epam.bobrikov.stage02.decomposition;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
 */
public class Task06 {
    public boolean taskCalculation(int a, int b, int c) {
        int counter = 0;
        for (int i = Math.min(Math.min(a, b), c); i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                counter++;
            }
        }
        return counter == 1;
    }
}
