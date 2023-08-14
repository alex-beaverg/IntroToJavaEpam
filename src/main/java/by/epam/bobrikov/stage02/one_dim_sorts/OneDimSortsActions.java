package by.epam.bobrikov.stage02.one_dim_sorts;

import java.util.Arrays;
import java.util.List;

public class OneDimSortsActions {
    public void taskActions() {
        System.out.println("One-dimensional arrays sorts actions:");

        // Task 01:
        System.out.println("Task 01: " + Arrays.toString(new Task01()
                .taskCalculation(new Integer[]{1, 2, 3, 4}, new int[]{8, 8}, 1)));

        // Task 02:
        System.out.println("Task 02: " + Arrays.toString(new Task02()
                .taskCalculation(new Integer[]{1, 5, 9, 10}, new int[]{2, 6, 15})));

        // Task 03:
        System.out.println("Task 03: " + Arrays.toString(new Task03().taskCalculation(new int[]{1, 16, 9, 10, 7, 2})));

        // Task 04:
        System.out.println("Task 04: " + new Task04().taskCalculation(new Integer[]{1, 16, 9, 10, 7, 2}));

        // Task 05:
        System.out.println("Task 05: " + Arrays.toString(new Task05().taskCalculation(new int[]{1, 16, 9, 10, 7, 2})));

        // Task 06:
        System.out.println("Task 06: " + Arrays.toString(new Task06().taskCalculation(new int[]{1, 16, 9, 10, 7, 2})));

        // Task 07:
        System.out.println("Task 07: " + new Task07()
                .taskCalculation(new Integer[]{1, 5, 9, 10, 40}, new Integer[]{2, 6, 15, 17, 21, 25, 30}));

        // Task 08:
        System.out.println("Task 08: " + new Task08().taskCalculation(List.of(
                new Task08.Fraction(1, 7),
                new Task08.Fraction(2, 3),
                new Task08.Fraction(5, 6))));

        System.out.println();
    }
}
