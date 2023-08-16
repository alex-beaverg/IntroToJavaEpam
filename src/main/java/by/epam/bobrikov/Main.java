package by.epam.bobrikov;

import by.epam.bobrikov.stage01.Stage01Actions;
import by.epam.bobrikov.stage02.Stage02Actions;
import by.epam.bobrikov.stage03.Stage03Actions;

public class Main {
    public static void main(String[] args) {
        // Stage 01:
        new Stage01Actions().stageActions();

        // Stage 02:
        new Stage02Actions().stageActions();

        // Stage 03:
        new Stage03Actions().stageActions();
    }
}
