package ua.lviv.iot.bicycleaccessory.model.item.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlashTest {
    private static final String NAME = "Test";
    private static final String MANUFACTURER = "TestManufacturer";
    private static final double PRICE = 49;
    private static final double WEIGHT = 3.2;
    private static final String COLOR = "testColor";

    private Flash flash;

    @BeforeEach
    void setup() {
        flash = new Flash(NAME, MANUFACTURER, PRICE, WEIGHT, COLOR);
    }

    @Test
    void basicConstructorWithGetters() {
        assertEquals(flash.getName(), NAME);
        assertEquals(flash.getManufacturer(), MANUFACTURER);
        assertEquals(flash.getPrice(), PRICE);
        assertEquals(flash.getWeight(), WEIGHT);
        assertEquals(flash.getColor(), COLOR);
    }
}
