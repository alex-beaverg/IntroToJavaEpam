package by.epam.bobrikov.stage04.aggregation;

import by.epam.bobrikov.stage04.aggregation.task_classes.Area;
import by.epam.bobrikov.stage04.aggregation.task_classes.City;
import by.epam.bobrikov.stage04.aggregation.task_classes.Region;
import by.epam.bobrikov.stage04.aggregation.task_classes.State;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль столицу,
 * количество областей, площадь, областные центры
 */
public class Task03 {
    public void taskCalculation() {
        City city1 = new City("Minsk", true, true);
        City city2 = new City("Brest", false, true);
        City city3 = new City("Grodno", false, true);
        City city4 = new City("Gomel", false, true);
        City city5 = new City("Vitebsk", false, true);
        City city6 = new City("Mogilev", false, true);
        City city7 = new City("Pinsk", false, false);
        City city8 = new City("Bobruisk", false, false);
        City city9 = new City("Polotsk", false, false);
        City city10 = new City("Lida", false, false);
        City city11 = new City("Zhlobin", false, false);
        City city12 = new City("Molodechno", false, false);

        Area area1 = new Area("Minsk area", 4000, city1);
        Area area2 = new Area("Brest area", 3500, city2);
        Area area3 = new Area("Grodno area", 3200, city3);
        Area area4 = new Area("Gomel area", 4200, city4);
        Area area5 = new Area("Vitebsk area", 4100, city5);
        Area area6 = new Area("Mogilev area", 3000, city6);
        Area area7 = new Area("Pinsk area", 2100, city7);
        Area area8 = new Area("Bobruisk area", 2300, city8);
        Area area9 = new Area("Polotsk area", 1900, city9);
        Area area10 = new Area("Lida area", 1200, city10);
        Area area11 = new Area("Zhlobin area", 1500, city11);
        Area area12 = new Area("Molodechno area", 1800, city12);

        Region region1 = new Region("Minsk region", city1);
        Region region2 = new Region("Brest region", city2);
        Region region3 = new Region("Grodno region", city3);
        Region region4 = new Region("Gomel region", city4);
        Region region5 = new Region("Vitebsk region", city5);
        Region region6 = new Region("Mogilev region", city6);

        region1.addArea(area1);
        region1.addArea(area12);
        region2.addArea(area2);
        region2.addArea(area7);
        region3.addArea(area3);
        region3.addArea(area10);
        region4.addArea(area4);
        region4.addArea(area11);
        region5.addArea(area5);
        region5.addArea(area9);
        region6.addArea(area6);
        region6.addArea(area8);

        State state = new State("Belarus", city1);
        state.addRegion(region1);
        state.addRegion(region2);
        state.addRegion(region3);
        state.addRegion(region4);
        state.addRegion(region5);
        state.addRegion(region6);

        state.printCapital();
        state.printQuantityRegions();
        state.printSquare();
        state.printRegionCenters();
    }
}
