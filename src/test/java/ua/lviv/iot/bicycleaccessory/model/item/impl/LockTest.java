package ua.lviv.iot.bicycleaccessory.model.item.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LockTest {
    private static final String NAME = "Test";
    private static final String MANUFACTURER = "TestManufacturer";
    private static final double PRICE = 32;
    private static final double WEIGHT = 5.3;
    private static final int SIZE1 = 2;
    private static final int SIZE2 = 3;

    private Lock lock;

    @BeforeEach
    void setup() {
        lock = new Lock(NAME, MANUFACTURER, PRICE, WEIGHT, SIZE1, SIZE2);
    }

    @Test
    void basicConstructorWithGetters() {
        assertEquals(lock.getName(), NAME);
        assertEquals(lock.getManufacturer(), MANUFACTURER);
        assertEquals(lock.getPrice(), PRICE);
        assertEquals(lock.getWeight(), WEIGHT);
        assertEquals(lock.getSize1(), SIZE1);
        assertEquals(lock.getSize2(), SIZE2);
    }
}
