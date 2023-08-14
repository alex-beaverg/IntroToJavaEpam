package by.epam.bobrikov.stage01.cycles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры
 */
public class Task07 {
    public Map<Integer, List<Integer>> taskCalculation(int numM, int numN) {

        /* Entering numbers from keyboard is done using Scanner:
        import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        int numM = scanner.nextInt();
        int numN = scanner.nextInt();
        But we use function arguments! */

        Map<Integer, List<Integer>> result = new HashMap<>();
        for (int i = numM; i <= numN; i++) {
            List<Integer> divisors = new ArrayList<>();
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisors.add(j);
                }
            }
            result.put(i, divisors);
        }
        return result;
    }
}
