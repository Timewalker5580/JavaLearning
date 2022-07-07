package model;

import manager.BicycleAccessoryManager;
import model.item.impl.Accessory;
import model.item.impl.Flash;
import model.item.impl.Lock;
import model.item.impl.Pump;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        BicycleAccessory bicycleAccessory = new BicycleAccessory(new ArrayList<>());
        BicycleAccessoryManager bicycleAccessoryManager = new BicycleAccessoryManager(bicycleAccessory);

        System.out.println("start add accessory");
        System.out.println();

        bicycleAccessory.addItems(generateAccessories());
        bicycleAccessory.addItems(generateFlashes());
        bicycleAccessory.addItems(generatePumps());
        bicycleAccessory.addItems(generateLocks());

        System.out.println("end add accessory");
        System.out.println();

        System.out.println("found accessory by manufacturer");
        System.out.println();

        var foundAccessory = bicycleAccessoryManager.findAccessoryByManufacturer("Ukraine");
        foundAccessory.forEach(System.out::println);

        System.out.println();

        System.out.println("found accessory by manufacturer and sort by weight");
        System.out.println();

        List<Accessory> foundAccessoryByManufacturerAndSortByWeight = bicycleAccessoryManager.findAccessoryByManufacturerAndSortByWeight("China", SortDirection.DESC);
        foundAccessoryByManufacturerAndSortByWeight.forEach(System.out::println);

        System.out.println();

    }

    private static List<Accessory> generateAccessories() {
        return List.of(
                new Accessory("Accessory1", "China", 230, 210),
                new Accessory("Accessory2", "China", 430, 98),
                new Accessory("Accessory3", "Ukraine", 760, 23250)
        );
    }

    private static List<Accessory> generateFlashes() {
        return List.of(
                new Flash("Ліхтар задній Jing Yi JY-6028T", "Ukraine", 207, 450, "black"),
                new Flash("Ліхтар задній Jing Yi JY-4243S", "China", 107, 200, "red"),
                new Flash("Ліхтар задній Jing Yi SR-3242F", "China", 53, 400, "white")
                );
    }

    private static List<Accessory> generatePumps() {
        return List.of(
                new Pump("Насос підлоговий Bee Pumps BG-02322 з манометром", "France", 367, 154, 9.6),
                new Pump("Насос підлоговий Bee Pumps ZF-04234 з манометром", "China", 43, 766, 5.4),
                new Pump("Насос підлоговий Bee Pumps FD-0534 з манометром", "Ukraine", 546, 243, 8.2)
        );
    }

    private static List<Accessory> generateLocks() {
        return List.of(
                new Lock("Кодовий замок FREFE TL04 з кріпленням", "France", 3432, 343, 4300,  12),
                new Lock("Кодовий замок TRINX TL03 з кріпленням", "France", 2343, 243, 3200,  13),
                new Lock("Кодовий замок GTEGET TL05 з кріпленням", "France", 5433, 112, 1400,  11)
        );
    }
}

