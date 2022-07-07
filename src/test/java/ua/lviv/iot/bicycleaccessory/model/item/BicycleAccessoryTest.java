package ua.lviv.iot.bicycleaccessory.model.item;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.bicycleaccessory.model.BicycleAccessory;
import ua.lviv.iot.bicycleaccessory.model.item.impl.Accessory;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class BicycleAccessoryTest {
    private BicycleAccessory bicycleAccessory;

    @BeforeEach
    void setup() {
        bicycleAccessory = new BicycleAccessory(new ArrayList<>());
    }

    @Test
    void testAddItem() {
        // given
        Accessory accessory = new Accessory("name", "China", 100, 120);

        // when
        bicycleAccessory.addItem(accessory);

        // then
        assertIterableEquals(bicycleAccessory.accessories(), List.of(accessory));
    }

    @Test
    void testAddItems() {
        // given
        Accessory accessory1 = new Accessory("HFijjhf", "jrjff", 737, 884);
        Accessory accessory2 = new Accessory("jgjrjgjr", "ghrghrhg", 43, 35);
        Accessory accessory3 = new Accessory("jjj", "dfd", 34, 23);

        // when
        bicycleAccessory.addItems(List.of(accessory1, accessory2, accessory3));

        // then
        assertThat(bicycleAccessory.accessories(), hasItems(accessory1, accessory2, accessory3));
    }
}
