package by.epam.bobrikov.stage03.string_as_object;

/**
 * Проверить, является ли заданное слово палиндромом
 */
public class Task03 {
    public boolean taskCalculation(String text) {
        StringBuilder newText = new StringBuilder(text);
        return newText.reverse().toString().equals(text);
    }
}
