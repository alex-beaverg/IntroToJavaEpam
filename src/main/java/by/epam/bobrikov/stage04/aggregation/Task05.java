package by.epam.bobrikov.stage04.aggregation;

import by.epam.bobrikov.stage04.aggregation.task_classes.TravelAgency;
import by.epam.bobrikov.stage04.aggregation.task_classes.TravelPackage;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного
 * типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок
 */
public class Task05 {
    public void taskCalculation() {
        TravelPackage package1 = new TravelPackage("Rest", "Air", 14, "All inclusive");
        TravelPackage package2 = new TravelPackage("Rest", "Train", 10, "All inclusive");
        TravelPackage package3 = new TravelPackage("Excursion", "Bus", 3, "Breakfasts");
        TravelPackage package4 = new TravelPackage("Treatment", "Bus", 7, "3 meals a day");
        TravelPackage package5 = new TravelPackage("Rest", "Air", 7, "Breakfasts");
        TravelPackage package6 = new TravelPackage("Excursion", "Bus", 5, "Breakfasts");
        TravelPackage package7 = new TravelPackage("Shopping", "Air", 3, "Breakfasts");
        TravelPackage package8 = new TravelPackage("Shopping", "Bus", 4, "Breakfasts");
        TravelPackage package9 = new TravelPackage("Cruise", "Ferry", 12, "All inclusive");
        TravelPackage package10 = new TravelPackage("Cruise", "Ferry", 8, "All inclusive");
        TravelPackage package11 = new TravelPackage("Rest", "Air", 7, "Breakfasts");
        TravelPackage package12 = new TravelPackage("Rest", "Air", 10, "All inclusive");
        TravelPackage package13 = new TravelPackage("Treatment", "Train", 9, "3 meals a day");
        TravelPackage package14 = new TravelPackage("Rest", "Bus", 11, "3 meals a day");
        TravelPackage package15 = new TravelPackage("Rest", "Air", 21, "All inclusive");

        TravelAgency travelAgency = new TravelAgency("Good Trip");
        travelAgency.addTravelPackage(package1);
        travelAgency.addTravelPackage(package2);
        travelAgency.addTravelPackage(package3);
        travelAgency.addTravelPackage(package4);
        travelAgency.addTravelPackage(package5);
        travelAgency.addTravelPackage(package6);
        travelAgency.addTravelPackage(package7);
        travelAgency.addTravelPackage(package8);
        travelAgency.addTravelPackage(package9);
        travelAgency.addTravelPackage(package10);
        travelAgency.addTravelPackage(package11);
        travelAgency.addTravelPackage(package12);
        travelAgency.addTravelPackage(package13);
        travelAgency.addTravelPackage(package14);
        travelAgency.addTravelPackage(package15);

        System.out.println("Find packages by type 'Rest' and sort by id:" +
                travelAgency.sortPackagesById(travelAgency.findPackagesByType("Rest")));

        System.out.println("Find packages by transport 'Air' and sort by food:" +
                travelAgency.sortPackagesByFood(travelAgency.findPackagesByTransport("Air")));

        System.out.println("Find packages by food 'Breakfasts' and sort by type:" +
                travelAgency.sortPackagesByType(travelAgency.findPackagesByFood("Breakfasts")));

        System.out.println("Find packages by days from 8 to 12 and sort by transport:" +
                travelAgency.sortPackagesByTransport(travelAgency.findPackagesByDays(8, 12)));

        System.out.println("Find packages by days from 5 to 15 and sort by days:" +
                travelAgency.sortPackagesByDays(travelAgency.findPackagesByDays(5, 15)));
    }
}
