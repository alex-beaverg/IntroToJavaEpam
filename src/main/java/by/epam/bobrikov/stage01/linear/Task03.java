package by.epam.bobrikov.stage01.linear;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((sinX + cosY) / (cosX - sinY)) * tg(x * y)
 */
public class Task03 {
    public double taskCalculation(double numX, double numY) {
        double z1 = Math.sin(numX) + Math.cos(numY);
        double z2 = Math.cos(numX) - Math.sin(numY);
        double z3 = Math.tan(numX * numY);
        return z1 / z2 * z3;
    }
}
