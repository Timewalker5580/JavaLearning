package ua.lviv.iot.bicycleaccessory.model;

import ua.lviv.iot.bicycleaccessory.model.item.impl.Accessory;

import java.util.List;

public record BicycleAccessory(List<Accessory> accessories) {

    public void addItem(Accessory accessory) {
        this.accessories.add(accessory);
    }

    public void addItems(List<Accessory> accessories) {
        this.accessories.addAll(accessories);
    }
}