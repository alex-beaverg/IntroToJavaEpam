package by.epam.bobrikov.stage05.Task04.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DragonCave {
    private static final List<DragonTreasure> treasures = new ArrayList<>();

    public DragonCave() {
        createAllTreasures();
    }

    public static List<DragonTreasure> getTreasures() {
        return treasures;
    }

    private void createAllTreasures() {
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                new DragonTreasure("Coin_" + i, random.nextInt(999) + 1);
            } else {
                new DragonTreasure("Jewel_" + (i * 10), random.nextInt(999) + 1);
            }
        }
    }

    public static class DragonTreasure {
        private final String name;
        private final int value;

        public DragonTreasure(String name, int value) {
            this.name = name;
            this.value = value;
            treasures.add(this);
        }

        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return name + ": $" + value;
        }
    }
}
