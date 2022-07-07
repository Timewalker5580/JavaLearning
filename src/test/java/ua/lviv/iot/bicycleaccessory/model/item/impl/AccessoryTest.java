package ua.lviv.iot.bicycleaccessory.model.item.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccessoryTest {
    private static final String NAME = "Test";
    private static final String MANUFACTURER = "TestManufacturer";
    private static final double PRICE = 89.79;
    private static final double WEIGHT = 12.2;

    private Accessory accessory;

    @BeforeEach
    void setup() {
        accessory = new Accessory(NAME, MANUFACTURER, PRICE, WEIGHT);
    }

    @Test
    void basicConstructorWithGetters() {
        assertEquals(accessory.getName(), NAME);
        assertEquals(accessory.getManufacturer(), MANUFACTURER);
        assertEquals(accessory.getPrice(), PRICE);
        assertEquals(accessory.getWeight(), WEIGHT);
    }
}
