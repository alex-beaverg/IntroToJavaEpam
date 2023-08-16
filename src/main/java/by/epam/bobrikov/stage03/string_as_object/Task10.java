package by.epam.bobrikov.stage03.string_as_object;

/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X
 */
public class Task10 {
    public int taskCalculation(String text) {
        int counter = 0;
        for (char c: text.toCharArray()) {
            if (c == '.' || c == '!' || c == '?') {
                counter++;
            }
        }
        return counter;
    }
}
