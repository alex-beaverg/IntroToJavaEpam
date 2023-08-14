package by.epam.bobrikov.stage02.decomposition;

import java.util.ArrayList;
import java.util.List;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти и
 * напечатать все пары «близнецов» из отрезка [n, 2n], где n - заданное натуральное число больше 2. Для решения
 * задачи использовать декомпозицию
 */
public class Task13 {
    public String[] taskCalculation(int n) {
        List<String> twinsList = new ArrayList<>();
        for (int i = n; i <= 2 * n; i++) {
            if (i + 2 <= 2 * n) {
                twinsList.add(twins(i));
            }
        }
        return twinsList.toArray(new String[0]);
    }

    public String twins(int x) {
        return "(" + x + ", " + (x + 2) + ")";
    }
}
