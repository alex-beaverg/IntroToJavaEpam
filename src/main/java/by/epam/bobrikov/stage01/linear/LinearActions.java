package by.epam.bobrikov.stage01.linear;

public class LinearActions {
    public void taskActions() {
        System.out.println("Linear actions:");

        // Task 01:
        System.out.println("Task 01: " + new Task01().taskCalculation(5, 3, 9));

        // Task 02:
        System.out.println("Task 02: " + new Task02().taskCalculation(5, 3, 9));

        // Task 03:
        System.out.println("Task 03: " + new Task03().taskCalculation(30, 15));

        // Task 04:
        System.out.println("Task 04: " + new Task04().taskCalculation(123.456));

        // Task 05:
        System.out.println("Task 05: " + new Task05().taskCalculation(6602));

        // Task 06:
        System.out.println("Task 06: " + new Task06().taskCalculation(-3, -3));

        System.out.println();
    }
}
