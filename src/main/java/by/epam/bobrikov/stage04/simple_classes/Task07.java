package by.epam.bobrikov.stage04.simple_classes;

import by.epam.bobrikov.stage04.simple_classes.task_classes.Point;
import by.epam.bobrikov.stage04.simple_classes.task_classes.Triangle;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
 * периметра и точки пересечения медиан
 */
public class Task07 {
    public void taskCalculation() {
        Triangle triangle = new Triangle(new Point(-1.6, -2), new Point(0.55, 8.3), new Point(5.1, 4));

        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle square: " + triangle.calculateSquare());
        System.out.println("Triangle centroid point: " + triangle.calculateCentroid().showPoint());
    }
}
