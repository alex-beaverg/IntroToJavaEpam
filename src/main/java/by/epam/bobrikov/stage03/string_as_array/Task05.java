package by.epam.bobrikov.stage03.string_as_array;

/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить
 */
public class Task05 {
    public String taskCalculation(String text) {
        while(text.contains("  ")) {
            text = text.replace("  ", " ");
        }
        return text.trim();
    }
}
