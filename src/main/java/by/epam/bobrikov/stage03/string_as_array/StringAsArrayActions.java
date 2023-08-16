package by.epam.bobrikov.stage03.string_as_array;

import java.util.Arrays;

public class StringAsArrayActions {
    public void taskActions() {
        System.out.println("String as array actions:");

        // Task 01:
        System.out.println("Task 01: " + Arrays.toString(new Task01().taskCalculation(new String[]{
                "firstVar", "secondVar", "maxSpeed", "minCapacity"})));

        // Task 02:
        System.out.println("Task 02: " + new Task02()
                .taskCalculation("Microsoft word is the best word in the world"));

        // Task 03:
        System.out.println("Task 03: " + new Task03()
                .taskCalculation("3. Microsoft word (31) is number 1 in the world 2"));

        // Task 04:
        System.out.println("Task 04: " + new Task04()
                .taskCalculation("31. Microsoft word (312) is number 1 in the world 24"));

        // Task 05:
        System.out.println("Task 05: " + new Task05()
                .taskCalculation("  Microsoft   word is     the best  word in     the   world  "));

        System.out.println();
    }
}
