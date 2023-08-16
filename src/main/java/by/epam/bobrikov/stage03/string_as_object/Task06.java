package by.epam.bobrikov.stage03.string_as_object;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды
 */
public class Task06 {
    public String taskCalculation(String text) {
        StringBuilder result = new StringBuilder();
        for (char c: text.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }
}
