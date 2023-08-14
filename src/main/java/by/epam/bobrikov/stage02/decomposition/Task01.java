package by.epam.bobrikov.stage02.decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел: НОК(A,B) = A * B / НОД(A,B)
 */
public class Task01 {
    public int[] taskCalculation(int a, int b) {
        return new int[]{nod(a, b), nok(a, b)};
    }

    public int nod(int a, int b) {
        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 0;
    }

    public int nok(int a, int b) {
        int nok = Math.max(a, b);
        while (true) {
            if (nok % a == 0 && nok % b == 0) {
                return nok;
            }
            nok++;
        }
    }
}
