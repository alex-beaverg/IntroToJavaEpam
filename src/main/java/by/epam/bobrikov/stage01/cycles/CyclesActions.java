package by.epam.bobrikov.stage01.cycles;

public class CyclesActions {
    public void taskActions() {
        System.out.println("Cycles actions:");

        // Task 01:
        System.out.println("Task 01: " + new Task01().taskCalculation(10));

        // Task 02:
        System.out.println("Task 02: " + new Task02().taskCalculation(new int[]{-1, 5}, 3));

        // Task 03:
        System.out.println("Task 03: " + new Task03().taskCalculation(-50));

        // Task 04:
        System.out.println("Task 04: " + new Task04().taskCalculation(5));

        // Task 05:
        System.out.println("Task 05: " + new Task05().taskCalculation(new int[]{-5, 5}, 10));

        // Task 06:
        System.out.println("Task 06: " + new Task06().taskCalculation(new char[]{'a', 'f'}));

        // Task 07:
        System.out.println("Task 07: " + new Task07().taskCalculation(17, 23));

        // Task 08:
        System.out.println("Task 08: " + new Task08().taskCalculation(1749, 2957));

        System.out.println();
    }
}
