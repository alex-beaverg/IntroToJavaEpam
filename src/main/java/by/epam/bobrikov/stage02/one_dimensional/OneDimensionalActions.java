package by.epam.bobrikov.stage02.one_dimensional;

import java.util.Arrays;

public class OneDimensionalActions {
    public void taskActions() {
        System.out.println("Actions with one-dimensional arrays:");

        // Task 01:
        System.out.println("Task 01: " + new Task01().taskCalculation(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2));

        // Task 02:
        System.out.println("Task 02: " + new Task02().taskCalculation(new int[]{1, 20, 3, 14, 5, 69, 7, 38}, 9));

        // Task 03:
        System.out.println("Task 03: " + new Task03().taskCalculation(new int[]{1, -2, 3, -4, 0, 6, -7, 8}));

        // Task 04:
        System.out.println("Task 04: " + Arrays.toString(new Task04()
                .taskCalculation(new int[]{1, -2, 3, -4, 0, 6, -7, 8})));

        // Task 05:
        System.out.println("Task 05: " + new Task05().taskCalculation(new int[]{1, -2, 2, -4, 4, 6, -7, 7}));

        // Task 06:
        System.out.println("Task 06: " + new Task06().taskCalculation(new double[]{1, -2, 2.5, -4.1, 4.9, 6, -7, 7}));

        // Task 07:
        System.out.println("Task 07: " + new Task07().taskCalculation(new int[]{10, 8, 5, 1, 51, 6, 7, 8, 95, 10, 9}));

        // Task 08:
        System.out.println("Task 08: " + new Task08().taskCalculation(new int[]{10, 8, 10, 9, 51, 18, 8, 95, 10, 9}));

        // Task 09:
        System.out.println("Task 09: " + new Task09().taskCalculation(new int[]{10, 8, 10, 9, 51, 9, 8, 95, 10, 9}));

        // Task 10:
        System.out.println("Task 10: " +  Arrays.toString(new Task10()
                .taskCalculation(new int[]{10, 8, 10, 9, 51, 9, 8, 95, 10, 9})));

        System.out.println();
    }
}
