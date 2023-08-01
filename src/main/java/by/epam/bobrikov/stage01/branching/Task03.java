package by.epam.bobrikov.stage01.branching;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
 */
public class Task03 {
    public boolean taskCalculation(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1);
    }
}
