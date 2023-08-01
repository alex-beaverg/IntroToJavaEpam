package by.epam.bobrikov.stage01.branching;

import java.util.Arrays;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет
 * ли он прямоугольным
 */
public class Task01 {
    public String taskCalculation(int angleA, int angleB) {
        boolean isTriangle = false;
        boolean isRightTriangle = false;
        if (180 - angleA - angleB > 0) {
            isTriangle = true;
            if (180 - angleA - angleB == 90) {
                isRightTriangle = true;
            }
        }
        return Arrays.toString(new boolean[]{isTriangle, isRightTriangle});
    }
}
