package by.epam.bobrikov.stage01.branching;

public class BranchingActions {
    public void taskActions() {
        System.out.println("Branching actions:");

        // Task 01:
        System.out.println("Task 01: " + new Task01().taskCalculation(45, 50));

        // Task 02:
        System.out.println("Task 02: " + new Task02().taskCalculation(1, 2, 3, 4));

        // Task 03:
        System.out.println("Task 03: " + new Task03().taskCalculation(1, 1, 2, 2, 10, 10));

        // Task 04:
        System.out.println("Task 04: " + new Task04().taskCalculation(6, 3, 4, 4, 10));

        // Task 05:
        System.out.println("Task 05: " + new Task05().taskCalculation(2));

        System.out.println();
    }
}
