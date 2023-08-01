package by.epam.bobrikov.stage01.branching;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич
 * через отверстие.
 */
public class Task04 {
    public boolean taskCalculation(int width, int height, int sideX, int sideY, int sideZ) {
        if (sideX <= width) {
            if (sideY <= height) {
                return true;
            }
            if (sideZ <= height) {
                return true;
            }
        }
        if (sideX <= height) {
            if (sideY <= width) {
                return true;
            }
            if (sideZ <= width) {
                return true;
            }
        }
        if (sideY <= width) {
            if (sideZ <= height) {
                return true;
            }
        }
        if (sideY <= height) {
            return sideZ <= width;
        }
        return false;
    }
}
