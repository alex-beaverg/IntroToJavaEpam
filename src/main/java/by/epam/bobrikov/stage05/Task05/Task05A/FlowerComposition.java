package by.epam.bobrikov.stage05.Task05.Task05A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FlowerComposition {
    private static final FlowerComposition instance = new FlowerComposition();
    private List<Flower> flowers;
    private List<Pack> packs;
    private List<Object> flowerComposition;
    private static final String[] colors = new String[] {"Red", "Blue", "Yellow", "Orange", "Purple", "White", "Pink"};
    private static final String[] flowerNames = new String[] {"Rose", "Tulip", "Chamomile", "Peony", "Carnation", "Violet"};
    private static final String[] packTypes = new String[] {"Ribbon", "Wrapper"};

    private FlowerComposition() {
        this.flowers = new ArrayList<>();
        this.packs = new ArrayList<>();
        this.flowerComposition = new ArrayList<>(Arrays.asList(flowers, packs));
    }

    public static FlowerComposition getInstance() {
        return instance;
    }

    public void createDecoration(String type) {
        if (type.equals("flower")) {
            new Flower(chooseFlower(), chooseColor());
        } else if (type.equals("pack")) {
            new Pack(choosePack(), chooseColor());
        } else {
            System.out.println("Decoration has not been created. Incorrect type of decoration!");
        }
    }

    public static String chooseColor() {
        Random random = new Random();
        return colors[random.nextInt(7)];
    }

    public static String chooseFlower() {
        Random random = new Random();
        return flowerNames[random.nextInt(6)];
    }

    public static String choosePack() {
        Random random = new Random();
        return packTypes[random.nextInt(2)];
    }

    public void printComposition() {
        System.out.println("Flower composition:");
        for (Object list: flowerComposition) {
            for (Decoration decoration: (List<Decoration>)list) {
                System.out.println("- " + decoration);
            }
        }
    }

    public class Flower implements Decoration {
        private String name;
        private String color;

        public Flower(String name, String color) {
            this.name = name;
            this.color = color;
            FlowerComposition.this.flowers.add(this);
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Flower: " + color + " " + name;
        }
    }

    public class Pack implements Decoration {
        private String type;
        private String color;

        public Pack(String type, String color) {
            this.type = type;
            this.color = color;
            FlowerComposition.this.packs.add(this);
        }

        public String getName() {
            return type;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Pack: " + color + " " + type;
        }
    }
}
