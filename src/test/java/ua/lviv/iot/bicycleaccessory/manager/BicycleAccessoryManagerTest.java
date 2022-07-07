package ua.lviv.iot.bicycleaccessory.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.bicycleaccessory.model.BicycleAccessory;
import ua.lviv.iot.bicycleaccessory.model.SortDirection;
import ua.lviv.iot.bicycleaccessory.model.item.impl.Accessory;
import ua.lviv.iot.bicycleaccessory.model.item.impl.Flash;
import ua.lviv.iot.bicycleaccessory.model.item.impl.Lock;
import ua.lviv.iot.bicycleaccessory.model.item.impl.Pump;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BicycleAccessoryManagerTest {
    private static final Accessory ACCESSORY = new Accessory("Test1", "TestManufacturerAccessory", 10.4, 3);
    private static final Flash FLASH1 = new Flash("Test2", "China", 4.3, 5, "red");
    private static final Lock LOCK1 = new Lock("Test3", "Ukraine", 6.2, 2.4, 1234, 34);
    private static final Pump PUMP1 = new Pump("Test4", "Ukraine", 9.1, 10, 344.3);
    private static final Lock LOCK2 = new Lock("Test5", "Ukraine", 3.2, 4, 323, 222);
    private static final Pump PUMP2 = new Pump("Test6", "Ukraine", 2.1, 1, 4212);


    private BicycleAccessoryManager bicycleAccessoryManager;

    @BeforeEach
    void setup() {
        bicycleAccessoryManager = new BicycleAccessoryManager(
                new BicycleAccessory(List.of(ACCESSORY, FLASH1, LOCK1, PUMP1, LOCK2, PUMP2)));
    }

    @Test
    void findAccessoryByManufacturerTest() {
        //given
        String accessoryManufacturer = "China";

        List<Accessory> expectedAccessory = List.of(FLASH1);

        //when
        List<Accessory> receivedAccessory = bicycleAccessoryManager.findAccessoryByManufacturer(accessoryManufacturer);

        //then
        assertIterableEquals(receivedAccessory, expectedAccessory);
    }

    @Test
    void findAccessoryByManufacturerAndSortByWeightAscTest() {
        //given
        String requiredManufacturer = "Ukraine";

        List<Accessory> expectedAccessory = List.of(PUMP2, LOCK1, LOCK2, PUMP1);

        //when
        List<Accessory> receivedAccessory = bicycleAccessoryManager.findAccessoryByManufacturerAndSortByWeight
                (requiredManufacturer, SortDirection.ASC);

        //then
        assertEquals(receivedAccessory, expectedAccessory);
    }

    @Test
    void findAccessoryByManufacturerAndSortByWeightDeskTest() {
        //given
        String requiredManufacturer = "Ukraine";

        List<Accessory> expectedAccessory = List.of(PUMP1, LOCK2, LOCK1, PUMP2);

        //when
        List<Accessory> receivedAccessory = bicycleAccessoryManager.findAccessoryByManufacturerAndSortByWeight
                (requiredManufacturer, SortDirection.DESC);

        //then
        assertEquals(receivedAccessory, expectedAccessory);
    }
}
