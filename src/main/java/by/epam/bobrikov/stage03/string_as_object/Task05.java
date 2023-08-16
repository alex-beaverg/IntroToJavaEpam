package by.epam.bobrikov.stage03.string_as_object;

/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”
 */
public class Task05 {
    public int taskCalculation(String text) {
        int counter = 0;
        for (char c: text.toCharArray()) {
            if (c == 'a') {
                counter++;
            }
        }
        return counter;
    }
}
