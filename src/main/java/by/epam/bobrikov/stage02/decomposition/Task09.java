package by.epam.bobrikov.stage02.decomposition;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y — прямой
 */
public class Task09 {
    public double taskCalculation(double x, double y, double z, double t) {
        return square1(x, y) + square2(z, t, diagonal(x, y), halfPerimeter(z, t, diagonal(x, y)));
    }

    public double diagonal(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double halfPerimeter(double z, double t, double diagonal) {
        return (z + t + diagonal) / 2;
    }

    public double square1(double x, double y) {
        return x * y / 2;
    }

    public double square2(double z, double t, double diagonal, double halfPerimeter) {
        return Math.sqrt(halfPerimeter * (halfPerimeter - z) * (halfPerimeter - t) * (halfPerimeter - diagonal));
    }
}
