package by.epam.bobrikov.stage02;

import by.epam.bobrikov.stage02.decomposition.DecompositionActions;
import by.epam.bobrikov.stage02.multi_dimensional.MultiDimensionalActions;
import by.epam.bobrikov.stage02.one_dim_sorts.OneDimSortsActions;
import by.epam.bobrikov.stage02.one_dimensional.OneDimensionalActions;

public class Stage02Actions {
    public void stageActions() {
        System.out.println("Stage 02:");

        // Actions with one-dimensional arrays:
        new OneDimensionalActions().taskActions();

        // Actions with multidimensional arrays:
        new MultiDimensionalActions().taskActions();

        // One-dimensional arrays sorts actions:
        new OneDimSortsActions().taskActions();

        // Decomposition Actions:
        new DecompositionActions().taskActions();

        System.out.println();
    }
}
