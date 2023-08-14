package by.epam.bobrikov.stage02.decomposition;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника
 */
public class Task03 {
    public double taskCalculation(int a) {
        return a * height(a) / 2;
    }

    public double height(int a) {
        return Math.pow(a, 2) - Math.pow(a / 2.0, 2);
    }
}
