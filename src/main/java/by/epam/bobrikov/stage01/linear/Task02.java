package by.epam.bobrikov.stage01.linear;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((b + √(b**2 + 4 * a * c)) / (2 * a)) - a**3 * c + b**(-2)
 */
public class Task02 {
    public double taskCalculation(double numA, double numB, double numC) {
        double x1 = numB + Math.sqrt(Math.pow(numB, 2) + 4 * numA * numC);
        double x2 = 2 * numA;
        double x3 = Math.pow(numA, 3) * numC;
        double x4 = Math.pow(numB, -2);
        return x1 / x2 - x3 + x4;
    }
}
