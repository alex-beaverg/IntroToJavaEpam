package by.epam.bobrikov.stage05;

import by.epam.bobrikov.stage05.Task01.Task01Actions;
import by.epam.bobrikov.stage05.Task02.Task02Actions;
import by.epam.bobrikov.stage05.Task03.Task03Actions;
import by.epam.bobrikov.stage05.Task04.Task04Actions;
import by.epam.bobrikov.stage05.Task05.Task05Actions;

public class Stage05Actions {
    public void stageActions(){
        System.out.println("Stage 05:");

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
        System.out.println();

        // Task 05A:
        System.out.println("Task 05A:");
        new Task05Actions().taskCalculation05A();
        System.out.println();

        // Task 05B:
        System.out.println("Task 05B:");
        new Task05Actions().taskCalculation05B();
        System.out.println();
    }
}
