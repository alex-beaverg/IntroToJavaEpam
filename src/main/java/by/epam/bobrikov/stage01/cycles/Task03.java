package by.epam.bobrikov.stage01.cycles;

/**
 * Найти сумму квадратов первых ста чисел
 */
public class Task03 {
    public int taskCalculation(int number) {
        int result = 0;
        for (int i = number; i < number + 100; i++) {
            result += Math.pow(i, 2);
        }
        return result;
    }
}
