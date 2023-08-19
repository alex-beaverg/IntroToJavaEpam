package by.epam.bobrikov;

import by.epam.bobrikov.stage01.Stage01Actions;
import by.epam.bobrikov.stage02.Stage02Actions;
import by.epam.bobrikov.stage03.Stage03Actions;
import by.epam.bobrikov.stage04.Stage04Actions;
import by.epam.bobrikov.stage05.Stage05Actions;

public class Main {
    public static void main(String[] args){
        // Stage 01:
        new Stage01Actions().stageActions();

        // Stage 02:
        new Stage02Actions().stageActions();

        // Stage 03:
        new Stage03Actions().stageActions();

        // Stage 04:
        new Stage04Actions().stageActions();

        // Stage 05:
        new Stage05Actions().stageActions();
    }
}
