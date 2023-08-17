package by.epam.bobrikov.stage04.aggregation.task_classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TravelAgency {
    private String name;
    private List<TravelPackage> travelPackages;

    public TravelAgency(String name) {
        this.name = name;
        this.travelPackages = new ArrayList<>();
    }

    public void addTravelPackage(TravelPackage travelPackage) {
        travelPackages.add(travelPackage);
    }

    public List<TravelPackage> sortPackagesById(List<TravelPackage> list) {
        list.sort(Comparator.comparing(TravelPackage::getId));
        return list;
    }

    public List<TravelPackage> sortPackagesByType(List<TravelPackage> list) {
        list.sort(Comparator.comparing(TravelPackage::getType));
        return list;
    }

    public List<TravelPackage> sortPackagesByTransport(List<TravelPackage> list) {
        list.sort(Comparator.comparing(TravelPackage::getTransport));
        return list;
    }

    public List<TravelPackage> sortPackagesByDays(List<TravelPackage> list) {
        list.sort(Comparator.comparing(TravelPackage::getDays));
        return list;
    }

    public List<TravelPackage> sortPackagesByFood(List<TravelPackage> list) {
        list.sort(Comparator.comparing(TravelPackage::getFood));
        return list;
    }

    public List<TravelPackage> findPackagesByType(String type) {
        List<TravelPackage> findList = new ArrayList<>();
        for (TravelPackage travelPackage: travelPackages) {
            if (travelPackage.getType().equals(type)) {
                findList.add(travelPackage);
            }
        }
        return findList;
    }

    public List<TravelPackage> findPackagesByTransport(String transport) {
        List<TravelPackage> findList = new ArrayList<>();
        for (TravelPackage travelPackage: travelPackages) {
            if (travelPackage.getTransport().equals(transport)) {
                findList.add(travelPackage);
            }
        }
        return findList;
    }

    public List<TravelPackage> findPackagesByDays(int fromDays, int toDays) {
        List<TravelPackage> findList = new ArrayList<>();
        for (TravelPackage travelPackage: travelPackages) {
            if (travelPackage.getDays() >= fromDays && travelPackage.getDays() <= toDays) {
                findList.add(travelPackage);
            }
        }
        return findList;
    }

    public List<TravelPackage> findPackagesByFood(String food) {
        List<TravelPackage> findList = new ArrayList<>();
        for (TravelPackage travelPackage: travelPackages) {
            if (travelPackage.getFood().equals(food)) {
                findList.add(travelPackage);
            }
        }
        return findList;
    }
}
