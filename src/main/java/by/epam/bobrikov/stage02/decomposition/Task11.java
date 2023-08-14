package by.epam.bobrikov.stage02.decomposition;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
 */
public class Task11 {
    public int taskCalculation(int num1, int num2) {
        if (String.valueOf(num1).toCharArray().length >= String.valueOf(num2).toCharArray().length) {
            return num1;
        } else {
            return num2;
        }
    }
}
