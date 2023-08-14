package by.epam.bobrikov.stage02.multi_dimensional;

public class MultiDimensionalActions {
    public void taskActions() {
        System.out.println("Actions with multidimensional arrays:");

        // Task 01:
        System.out.println("Task 01: " + new Task01().taskCalculation(new int[][]{
                {1, 2, 3, 4, 5, 3, 7, 8},
                {4, 5, 6, 3, 2, 1, 5, 9},
                {2, 1, 9, 5, 9, 4, 9, 1}}));

        // Task 02:
        System.out.println("Task 02: " + new Task02().taskCalculation(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}}));

        // Task 03:
        System.out.println("Task 03: " + new Task03().taskCalculation(new int[][]{
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 1}}, 1, 2));

        // Task 04:
        System.out.println("Task 04: " + new Task04().taskCalculation(4));

        // Task 05:
        System.out.println("Task 05: " + new Task05().taskCalculation(4));

        // Task 06:
        System.out.println("Task 06: " + new Task06().taskCalculation(4));

        // Task 07:
        System.out.println("Task 07: " + new Task07().taskCalculation(4));

        // Task 08:
        System.out.println("Task 08: " + new Task08().taskCalculation(new int[][]{
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 1}}, 1, 3));

        // Task 09:
        System.out.println("Task 09: " + new Task09().taskCalculation(new int[][]{
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 1}}));

        // Task 10:
        System.out.println("Task 10: " + new Task10().taskCalculation(new int[][]{
                {1, 2, 3, 8, 6},
                {4, -5, 6, 7, 1},
                {4, -5, 6, 7, 1},
                {4, -5, 6, -7, 1},
                {7, 8, 9, 9, 10}}));

        // Task 11:
        System.out.println("Task 11: " + new Task11().taskCalculation(10, 20));

        // Task 12:
        System.out.println("Task 12: " + new Task12().taskCalculation(new int[][]{
                {10, 21, 3, 4},
                {14, 56, 16, 7},
                {7, 82, 19, 1}}));

        // Task 13:
        System.out.println("Task 13: " + new Task13().taskCalculation(new int[][]{
                {10, 21, 3, 4},
                {14, 56, 16, 7},
                {7, 82, 19, 1}}));

        // Task 14:
        System.out.println("Task 14: " + new Task14().taskCalculation(5, 3));

        // Task 15:
        System.out.println("Task 15: " + new Task15().taskCalculation(new int[][]{
                {10, 21, 3, 4},
                {14, 56, 16, 7},
                {7, 82, 19, 1}}));

        // Task 16:
        System.out.println("Task 16 (n = 3): " + new Task16().taskCalculation(3));
        System.out.println("Task 16 (n = 4): " + new Task16().taskCalculation(4));

        System.out.println();
    }
}
