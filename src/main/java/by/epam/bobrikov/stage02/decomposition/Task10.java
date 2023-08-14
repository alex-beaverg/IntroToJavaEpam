package by.epam.bobrikov.stage02.decomposition;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N
 */
public class Task10 {
    public char[] taskCalculation(int number) {
        char[] array = new char[String.valueOf(number).toCharArray().length];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(number).toCharArray()[i];
        }
        return array;
    }
}
