package by.epam.bobrikov.stage02.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompositionActions {
    public void taskActions() {
        System.out.println("Decomposition actions:");

        // Task 01:
        System.out.println("Task 01: " + Arrays.toString(new Task01().taskCalculation(15, 25)));

        // Task 02:
        System.out.println("Task 02: " + new Task02().taskCalculation(24, 54, 36, 16));

        // Task 03:
        System.out.println("Task 03: " + new Task03().taskCalculation(5));

        // Task 04:
        System.out.println("Task 04: " + Arrays.toString(new Task04().taskCalculation(new ArrayList<>(List.of(
                new Task04.Point(1, 4),
                new Task04.Point(10, 25),
                new Task04.Point(3, 8),
                new Task04.Point(5, -7))))));

        // Task 05:
        System.out.println("Task 05: " + new Task05().taskCalculation(new int[]{10, 5, 65, 25, 60, 43, 1}));

        // Task 06:
        System.out.println("Task 06: " + new Task06().taskCalculation(24, 54, 37));

        // Task 07:
        System.out.println("Task 07: " + new Task07().taskCalculation(1, 9));

        // Task 08:
        System.out.println("Task 08: " + new Task08().taskCalculation(new int[]{10, 5, 65, 25, 60, 43, 1}, 1, 3));

        // Task 09:
        System.out.println("Task 09: " + new Task09().taskCalculation(5.1, 4.2, 10.3, 11.0));

        // Task 10:
        System.out.println("Task 10: " + Arrays.toString(new Task10().taskCalculation(1543)));

        // Task 11:
        System.out.println("Task 11: " + new Task11().taskCalculation(1543, 25687));

        // Task 12:
        System.out.println("Task 12: " + Arrays.toString(new Task12().taskCalculation(100, 25)));

        // Task 13:
        System.out.println("Task 13: " + Arrays.toString(new Task13().taskCalculation(10)));

        // Task 14:
        System.out.println("Task 14: " + Arrays.toString(new Task14().taskCalculation(1000)));

        // Task 15:
        System.out.println("Task 15: " + Arrays.toString(new Task15().taskCalculation(4)));

        // Task 16:
        System.out.println("Task 16: " + Arrays.toString(new Task16().taskCalculation(4)));

        // Task 17:
        System.out.println("Task 17: " + new Task17().taskCalculation(21));

        System.out.println();
    }
}
