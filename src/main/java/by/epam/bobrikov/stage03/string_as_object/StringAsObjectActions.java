package by.epam.bobrikov.stage03.string_as_object;

import java.util.Arrays;

public class StringAsObjectActions {
    public void taskActions() {
        System.out.println("String as object actions:");

        // Task 01:
        System.out.println("Task 01: " + Arrays.toString(new Task01()
                .taskCalculation("  Microsoft   word is      the best  word in        the   world  ")));

        // Task 02:
        System.out.println("Task 02: " + new Task02().taskCalculation("Take my hands"));

        // Task 03:
        System.out.println("Task 03: " + new Task03().taskCalculation("bob"));

        // Task 04:
        System.out.println("Task 04: " + new Task04().taskCalculation("informatika"));

        // Task 05:
        System.out.println("Task 05: " + new Task05().taskCalculation("informatika"));

        // Task 06:
        System.out.println("Task 06: " + new Task06().taskCalculation("informatika"));

        // Task 07:
        System.out.println("Task 07: " + new Task07().taskCalculation("abc cde def"));

        // Task 08:
        System.out.println("Task 08: " + new Task08().taskCalculation("Hello my dear friend"));

        // Task 09:
        System.out.println("Task 09: " + Arrays.toString(new Task09().taskCalculation("Hello my dear Друг")));

        // Task 10:
        System.out.println("Task 10: " + new Task10()
                .taskCalculation("Take my hands. Close your eyes! How are you? What happened?"));

        System.out.println();
    }
}
