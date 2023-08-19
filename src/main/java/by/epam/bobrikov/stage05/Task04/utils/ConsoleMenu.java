package by.epam.bobrikov.stage05.Task04.utils;

import java.util.Scanner;

public class ConsoleMenu {
    private static boolean isNotExit = true;

    public static void runApplication() {
        Scanner in = new Scanner(System.in);
        while (isNotExit) {
            System.out.println("APPLICATION MENU");
            System.out.println("----------------");
            System.out.println("Enter '1' to view all dragon treasures");
            System.out.println("Enter '2' to view the most expensive dragon treasure");
            System.out.println("Enter '3' to view dragon treasures for the total amount you choose");
            System.out.println("Enter '0' to exit");
            System.out.print("Your choice: ");
            int num = in.nextInt();
            switch (num) {
                case 0 -> isNotExit = false;
                case 1 -> TreasureFunctions.viewAllTreasures();
                case 2 -> TreasureFunctions.viewTheMostExpensiveTreasure();
                case 3 -> {
                    System.out.print("Your total amount: ");
                    int total = in.nextInt();
                    TreasureFunctions.viewTreasuresTotaling(total);
                }
                default -> {
                    System.out.println();
                    System.out.println("Enter '0', '1', '2' or '3' please...");
                    System.out.println();
                }
            }
        }
        in.close();
    }
}
