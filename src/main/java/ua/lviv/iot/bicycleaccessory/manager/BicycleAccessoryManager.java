package ua.lviv.iot.bicycleaccessory.manager;

import ua.lviv.iot.bicycleaccessory.model.BicycleAccessory;
import ua.lviv.iot.bicycleaccessory.model.SortDirection;
import ua.lviv.iot.bicycleaccessory.model.item.impl.Accessory;

import java.util.Comparator;
import java.util.List;

import static ua.lviv.iot.bicycleaccessory.model.SortDirection.ASC;


public class BicycleAccessoryManager {

    private final BicycleAccessory bicycleAccessory;

    public BicycleAccessoryManager(BicycleAccessory bicycleAccessory) {
        this.bicycleAccessory = bicycleAccessory;
    }

    public List<Accessory> findAccessoryByManufacturer(String accessoryManufacturer) {
        return bicycleAccessory.accessories().stream()
                .filter(accessory -> accessory.getManufacturer().equals(accessoryManufacturer)).toList();
    }

    private List<Accessory> sortAccessoryByManufacturer(List<Accessory> accessories, SortDirection sortDirection) {
        var manufacturerComparator = Comparator.comparing(Accessory::getManufacturer);
        return accessories.stream()
                .sorted(sortDirection == ASC ? manufacturerComparator : manufacturerComparator.reversed())
                .toList();
    }

    private List<Accessory> sortAccessoryByWeight(List<Accessory> accessories, SortDirection sortDirection) {
        var weightComparator = Comparator.comparing(Accessory::getWeight);
        return accessories.stream()
                .sorted(sortDirection == ASC ? weightComparator : weightComparator.reversed())
                .toList();
    }

    public List<Accessory> findAccessoryByManufacturerAndSortByWeight(String accessoryManufacturer, SortDirection sortDirection) {
        return sortAccessoryByWeight(findAccessoryByManufacturer(accessoryManufacturer), sortDirection);
    }

}
