package ua.lviv.iot.bicycleaccessory.model.item.impl;

import ua.lviv.iot.bicycleaccessory.model.item.Flashable;

public class Flash extends Accessory implements Flashable {
    private final String color;

    public Flash(String name, String manufacture, double price, double weight, String color) {
        super(name, manufacture, price, weight);
        this.color = color;
    }

    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Flash{" +
                "name - '" + getName() + '\'' +
                ", manufacturer - '" + getManufacturer() + '\'' +
                ", price = " + getPrice() +
                ", weight =" + getWeight() +
                ", color =" + getColor() +
                '}';
    }
}