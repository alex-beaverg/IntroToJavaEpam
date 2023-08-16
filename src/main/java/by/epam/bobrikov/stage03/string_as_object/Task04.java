package by.epam.bobrikov.stage03.string_as_object;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”
 */
public class Task04 {
    public String taskCalculation(String text) {
        return String.valueOf(text.charAt(7)) + text.charAt(3) + text.charAt(4) + text.charAt(7);
    }
}
