package by.epam.bobrikov.stage03.string_as_object;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда
 * самых длинных слов может быть несколько, не обрабатывать
 */
public class Task08 {
    public String taskCalculation(String text) {
        String[] array = text.split(" ");
        int maxLength = 0;
        StringBuilder maxWord = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i].toCharArray().length > maxLength) {
                maxLength = array[i].toCharArray().length;
                maxWord = new StringBuilder(array[i]);
            }
        }
        return maxWord.toString();
    }
}
