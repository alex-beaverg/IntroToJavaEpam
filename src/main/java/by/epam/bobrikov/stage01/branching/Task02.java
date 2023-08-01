package by.epam.bobrikov.stage01.branching;

/**
 * Найти max{min(a, b), min(c, d)}
 */
public class Task02 {
    public int taskCalculation(int numA, int numB, int numC, int numD) {

        /* Action could be taken with Math:
        return Math.max(Math.min(numA, numB), Math.min(numC, numD));
        But we need to use branching! */

        int result1, result2, result;
        if (numA < numB) {
            result1 = numA;
        } else {
            result1 = numB;
        }
        if (numC < numD) {
            result2 = numC;
        } else {
            result2 = numD;
        }
        if (result1 > result2) {
            result = result1;
        } else {
            result = result2;
        }
        return result;
    }
}
