package by.epam.bobrikov.stage03.string_as_object;

/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef"
 */
public class Task07 {
    public String taskCalculation(String text) {
        StringBuilder result = new StringBuilder();
        for (char c: text.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString().replace(" ", "");
    }
}
