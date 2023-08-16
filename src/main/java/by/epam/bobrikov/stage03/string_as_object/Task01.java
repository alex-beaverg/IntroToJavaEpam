package by.epam.bobrikov.stage03.string_as_object;

/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
 */
public class Task01 {
    public String[] taskCalculation(String text) {
        int maxSpaces = 0;
        int endIndex = 0;
        int spaces = 0;
        int symbols = 0;
        for (int i = 0; i < text.toCharArray().length; i++) {
            if (text.toCharArray()[i] == ' ') {
                spaces++;
            } else {
                symbols++;
            }
            if (symbols > 0 && spaces == 0) {
                continue;
            } else if (symbols > 0 && spaces == 1) {
                symbols = 0;
            }
            if (spaces > 0 && symbols == 1) {
                if (spaces > maxSpaces) {
                    maxSpaces = spaces - 1;
                    endIndex = i - 1;
                }
                spaces = 0;
                symbols = 0;
            }
        }
        return new String[]{"Start position: " + (endIndex - maxSpaces + 1), "End position: " + endIndex};
    }
}
