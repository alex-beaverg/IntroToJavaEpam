package by.epam.bobrikov.stage04.simple_classes.task_classes;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double calculateSideLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2));
    }

    public double calculatePerimeter() {
        return calculateSideLength(pointA, pointB) + calculateSideLength(pointB, pointC) +
                calculateSideLength(pointC, pointA);
    }

    public double calculateSquare() {
        double halfP = calculatePerimeter() / 2.0;
        double sideAB = calculateSideLength(pointA, pointB);
        double sideBC = calculateSideLength(pointB, pointC);
        double sideCA = calculateSideLength(pointC, pointA);
        return Math.sqrt(halfP * (halfP - sideAB) * (halfP - sideBC) * (halfP - sideCA));
    }

    public Point calculateCentroid() {
        double x1 = pointC.getX();
        double y1 = pointC.getY();
        double x2 = (pointA.getX() + pointB.getX()) / 2.0;
        double y2 = (pointA.getY() + pointB.getY()) / 2.0;
        double x3 = pointB.getX();
        double y3 = pointB.getY();
        double x4 = (pointA.getX() + pointC.getX()) / 2.0;
        double y4 = (pointA.getY() + pointC.getY()) / 2.0;

        double x = ((x1 * y2 - x2 * y1) * (x4 - x3) - (x3 * y4 - x4 * y3) * (x2 - x1)) /
                ((y1 - y2) * (x4 - x3) - (y3 - y4) * (x2 - x1));
        double y = ((y3 - y4) * x - (x3 * y4 - x4 * y3)) / (x4 - x3);

        return new Point(x, y);
    }
}
