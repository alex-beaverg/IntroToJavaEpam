package by.epam.bobrikov.stage01.branching;

/**
 * Вычислить значение функции:
 * x**2 - 3 * x + 9, если x <= 3
 * 1 / (x**3 + 6), если x > 3
 */
public class Task05 {
    public double taskCalculation(int number) {
        if (number <= 3) {
            return Math.pow(number, 2) - 3 * number + 9;
        } else {
            return 1 / (Math.pow(number, 3) + 6);
        }
    }
}
