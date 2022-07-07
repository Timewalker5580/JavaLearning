package ua.lviv.iot.bicycleaccessory.model.item.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PumpTest {
    private static final String NAME = "Test";
    private static final String MANUFACTURER = "TestManufacturer";
    private static final double PRICE = 234;
    private static final double WEIGHT = 2.44;
    private static final double PRESSURE = 233.1;

    private Pump pump;

    @BeforeEach
    void setup() {
        pump = new Pump(NAME, MANUFACTURER, PRICE, WEIGHT, PRESSURE);
    }

    @Test
    void basicConstructorWithGetters() {
        assertEquals(pump.getName(), NAME);
        assertEquals(pump.getManufacturer(), MANUFACTURER);
        assertEquals(pump.getPrice(), PRICE);
        assertEquals(pump.getWeight(), WEIGHT);
        assertEquals(pump.getPressure(), PRESSURE);
    }
}
