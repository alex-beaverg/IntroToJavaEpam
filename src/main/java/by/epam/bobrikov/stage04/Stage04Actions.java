package by.epam.bobrikov.stage04;

import by.epam.bobrikov.stage04.aggregation.AggregationActions;
import by.epam.bobrikov.stage04.simple_classes.SimpleClassesActions;

public class Stage04Actions {
    public void stageActions() {
        System.out.println("Stage 04:");

        // Simple classes actions:
        new SimpleClassesActions().taskActions();

        // Aggregation and composition actions:
        new AggregationActions().taskActions();
    }
}
