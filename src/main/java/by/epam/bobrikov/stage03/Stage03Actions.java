package by.epam.bobrikov.stage03;

import by.epam.bobrikov.stage03.regex.RegexActions;
import by.epam.bobrikov.stage03.string_as_array.StringAsArrayActions;
import by.epam.bobrikov.stage03.string_as_object.StringAsObjectActions;

public class Stage03Actions {
    public void stageActions() {
        System.out.println("Stage 03:");

        // String as array actions:
        new StringAsArrayActions().taskActions();

        // String as object actions:
        new StringAsObjectActions().taskActions();

        // Regex actions:
        new RegexActions().taskActions();
    }
}
