package by.epam.bobrikov.stage02.decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
 * сумма цифр которых равна К и которые не большее N
 */
public class Task12 {
    public Integer[] taskCalculation(int k, int n) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        while (sumList(list) != k) {
            list.add(random.nextInt(n + 1));
            if (sumList(list) > k) {
                list.remove(list.size() - 1);
                list.add(k - sumList(list));
            }
        }
        return list.toArray(new Integer[0]);
    }

    public int sumList(List<Integer> list) {
        int sum = 0;
        for (int item: list) {
            sum += item;
        }
        return sum;
    }
}
