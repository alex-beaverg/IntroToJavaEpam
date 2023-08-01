package by.epam.bobrikov.stage01.cycles;

import java.util.ArrayList;
import java.util.List;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */
public class Task08 {
    public List<Integer> taskCalculation(int num1, int num2) {
        List<Integer> sameDigits = new ArrayList<>();
        for (char digit: String.valueOf(num1).toCharArray()) {
            if (String.valueOf(num2).contains(String.valueOf(digit))) {
                sameDigits.add(Integer.valueOf(String.valueOf(digit)));
            }
        }
        return sameDigits;
    }
}
