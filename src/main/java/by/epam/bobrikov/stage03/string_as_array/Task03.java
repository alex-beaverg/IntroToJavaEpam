package by.epam.bobrikov.stage03.string_as_array;

/**
 * В строке найти количество цифр
 */
public class Task03 {
    public int taskCalculation(String text) {
        int digitsCounter = 0;
        for (char symbol: text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitsCounter++;
            }
        }
        return digitsCounter;
    }
}
