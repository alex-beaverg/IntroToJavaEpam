package by.epam.bobrikov.stage01.linear;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа
 */
public class Task04 {
    public double taskCalculation(double number) {
        String sNumber = String.valueOf(number);
        String subStr1 = sNumber.substring(0, 3);
        String subStr2 = sNumber.substring(4);
        return Double.parseDouble(subStr2 + "." + subStr1);
    }
}
