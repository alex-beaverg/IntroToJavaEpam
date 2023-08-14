package by.epam.bobrikov.stage02.decomposition;

import java.util.List;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек
 * самое большое расстояние.
 * Указание: Координаты точек занести в массив
 */
public class Task04 {
    public Point[] taskCalculation(List<Point> points) {
        double x = 0;
        Point a = points.get(0);
        Point b = points.get(0);
        for (int i = 0; i < points.size(); i++) {
            for (Point point : points) {
                if (length(points.get(i), point) > x) {
                    x = length(points.get(i), point);
                    a = points.get(i);
                    b = point;
                }
            }
        }
        return new Point[]{a, b};
    }

    public double length(Point a, Point b) {
        return Math.abs(Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2)));
    }

    static class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(x=" + x + ", y=" + y + ")";
        }
    }
}
