package by.epam.bobrikov.stage06;

import by.epam.bobrikov.stage06.Task01.Task01Actions;
import by.epam.bobrikov.stage06.Task02.Task02Actions;
import by.epam.bobrikov.stage06.Task03.Task03Actions;
import by.epam.bobrikov.stage06.Task04.Task04Actions;

public class Stage06Actions {
    public void stageActions() {
        System.out.println("Stage 06:");

        // Task 01:
        System.out.println("Task 01:");
        new Task01Actions().taskCalculation();
        System.out.println();

        // Task 02:
        System.out.println("Task 02:");
        new Task02Actions().taskCalculation();
        System.out.println();

        // Task 03:
        System.out.println("Task 03:");
        new Task03Actions().taskCalculation();
        System.out.println();

        // Task 04:
        System.out.println("Task 04:");
        new Task04Actions().taskCalculation();
    }
}
