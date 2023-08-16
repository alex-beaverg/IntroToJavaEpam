package by.epam.bobrikov.stage03.string_as_array;

import java.util.ArrayList;
import java.util.List;

/**
 * В строке найти количество чисел
 */
public class Task04 {
    public int taskCalculation(String text) {
        List<Integer> numbers = new ArrayList<>();
        String number = "";
        for (int i = 0; i < text.toCharArray().length; i++) {
            boolean isDigit = false;
            if (Character.isDigit(text.toCharArray()[i])) {
                isDigit = true;
                number += text.toCharArray()[i];
            }
            if (!isDigit && !numbers.contains(Integer.valueOf(number)) || i == text.toCharArray().length - 1 &&
                    isDigit && !numbers.contains(Integer.valueOf(number))) {
                numbers.add(Integer.valueOf(number));
            }
        }
        return numbers.size();
    }
}
