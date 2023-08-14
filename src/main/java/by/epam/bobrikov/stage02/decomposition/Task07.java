package by.epam.bobrikov.stage02.decomposition;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9
 */
public class Task07 {
    public int taskCalculation(int a, int b) {
        int sumFactorials = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sumFactorials += factorial(i);
            }
        }
        return sumFactorials;
    }

    public int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
