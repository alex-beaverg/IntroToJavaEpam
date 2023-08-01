package by.epam.bobrikov.stage01.cycles;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все
 * числа от 1 до введенного пользователем числа
 */
public class Task01 {
    public int taskCalculation(int number) {

        /* Entering number from keyboard is done using Scanner:
        import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        But we use function arguments!*/

        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        return result;
    }
}
