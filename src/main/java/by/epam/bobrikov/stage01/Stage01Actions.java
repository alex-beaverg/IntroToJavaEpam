package by.epam.bobrikov.stage01;

import by.epam.bobrikov.stage01.branching.BranchingActions;
import by.epam.bobrikov.stage01.cycles.CyclesActions;
import by.epam.bobrikov.stage01.linear.LinearActions;

public class Stage01Actions {
    public void stageActions() {
        System.out.println("Stage 01:");

        // Linear actions:
        new LinearActions().taskActions();

        // Branching actions:
        new BranchingActions().taskActions();

        // Cycles actions:
        new CyclesActions().taskActions();

        System.out.println();
    }
}
