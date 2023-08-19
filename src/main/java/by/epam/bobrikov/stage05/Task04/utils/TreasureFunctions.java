package by.epam.bobrikov.stage05.Task04.utils;

import by.epam.bobrikov.stage05.Task04.objects.DragonCave;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TreasureFunctions {
    public static void viewAllTreasures() {
        System.out.println("All dragon treasures in the dragon cave:");
        for (DragonCave.DragonTreasure treasure: DragonCave.getTreasures()) {
            System.out.println(treasure);
        }
        System.out.println();
    }

    public static void viewTheMostExpensiveTreasure() {
        int maxValue = 0;
        DragonCave.DragonTreasure tempDragonTreasure = DragonCave.getTreasures().get(0);
        for (DragonCave.DragonTreasure treasure: DragonCave.getTreasures()) {
            if (treasure.getValue() > maxValue) {
                maxValue = treasure.getValue();
                tempDragonTreasure = treasure;
            }
        }

        // Print results:
        System.out.print("The most expensive treasure in the dragon cave: ");
        System.out.println(tempDragonTreasure);
        System.out.println();
    }

    public static void viewTreasuresTotaling(int totalValue) {
        List<DragonCave.DragonTreasure> treasuresWithTotalValue = new ArrayList<>();
        List<String> tempNamesOfTreasures = new ArrayList<>();
        Random random = new Random();
        int tempTotal = 0;
        int tempIndex = 0;
        while (tempTotal < totalValue) {
            tempIndex = random.nextInt(100);
            if (!tempNamesOfTreasures.contains(DragonCave.getTreasures().get(tempIndex).getName())) {
                treasuresWithTotalValue.add(DragonCave.getTreasures().get(tempIndex));
                tempNamesOfTreasures.add(DragonCave.getTreasures().get(tempIndex).getName());
                tempTotal += DragonCave.getTreasures().get(tempIndex).getValue();
            }
        }
        tempTotal -= DragonCave.getTreasures().get(tempIndex).getValue();
        treasuresWithTotalValue.remove(treasuresWithTotalValue.size() - 1);

        // Print results:
        System.out.println("Dragon treasures totaling $" + totalValue + " in the dragon cave: ");
        System.out.println("The amount you spent: $" + tempTotal);
        for (DragonCave.DragonTreasure treasure: treasuresWithTotalValue) {
            System.out.println(treasure);
        }
        System.out.println();
    }
}
