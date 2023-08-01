package by.epam.bobrikov.stage01.cycles;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */
public class Task04 {
    public int taskCalculation(int number) {
        int result = 1;
        for (int i = number; i < number + 200; i++) {
            result *= Math.pow(i, 2);
        }
        return result;
    }
}
