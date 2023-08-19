package by.epam.bobrikov.stage05.Task05.Task05B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Present {
    private static final Present instance = new Present();
    private List<Present.Sweet> sweets;
    private List<Present.Pack> packs;
    private List<Object> present;
    private static final String[] sweetTastes = new String[] {"Chocolate", "Milk", "Fruit", "Sugar"};
    private static final String[] sweetNames = new String[] {"Candies", "Cakes", "Marmalade", "Marshmallow", "Gum"};
    private static final String[] packColors = new String[] {"Red", "Blue", "Yellow", "Orange", "Purple", "White", "Pink"};
    private static final String[] packTypes = new String[] {"Box", "Paper", "Bag", "Bucket"};

    private Present () {
        this.sweets = new ArrayList<>();
        this.packs = new ArrayList<>();
        this.present = new ArrayList<>(Arrays.asList(sweets, packs));
    }

    public static Present getInstance() {
        return instance;
    }

    public void createComponent(String type) {
        if (type.equals("sweet")) {
            new Sweet(chooseTaste(), chooseName());
        } else if (type.equals("pack")) {
            new Pack(chooseColor(), chooseType());
        } else {
            System.out.println("Component has not been created. Incorrect type of component!");
        }
    }

    public String chooseTaste() {
        Random random = new Random();
        return sweetTastes[random.nextInt(4)];
    }

    public String chooseName() {
        Random random = new Random();
        return sweetNames[random.nextInt(5)];
    }

    public String chooseColor() {
        Random random = new Random();
        return packColors[random.nextInt(7)];
    }

    public String chooseType() {
        Random random = new Random();
        return packTypes[random.nextInt(4)];
    }

    public void printPresent() {
        System.out.println("Present:");
        for (Object list: present) {
            for (Component component: (List<Component>)list) {
                System.out.println("- " + component);
            }
        }
    }

    public class Sweet implements Component {
        private String taste;
        private String name;

        public Sweet(String taste, String name) {
            this.taste = taste;
            this.name = name;
            Present.this.sweets.add(this);
        }

        @Override
        public String getFirstParameter() {
            return taste;
        }

        @Override
        public String getSecondParameter() {
            return name;
        }

        @Override
        public String toString() {
            return "Sweet: " + taste + " " + name;
        }
    }

    public class Pack implements Component {
        private String color;
        private String type;

        public Pack(String color, String type) {
            this.color = color;
            this.type = type;
            Present.this.packs.add(this);
        }

        @Override
        public String getFirstParameter() {
            return color;
        }

        @Override
        public String getSecondParameter() {
            return type;
        }

        @Override
        public String toString() {
            return "Pack: " + color + " " + type;
        }
    }
}
