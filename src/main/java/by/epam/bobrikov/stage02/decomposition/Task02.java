package by.epam.bobrikov.stage02.decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
 */
public class Task02 {
    public int taskCalculation(int a, int b, int c, int d) {
        for (int i = Math.min(Math.min(a, b), Math.min(c, d)); i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
