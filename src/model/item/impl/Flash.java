package model.item.impl;

import model.item.Flashable;

public class Flash extends Accessory implements Flashable {
    private final String color;

    public Flash(String name, String manufacture, double price, String material, String color) {
        super(name, manufacture, price, material);
        this.color = color;
    }

    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Flash{" +
                "name - '" + getName() + '\'' +
                ", manufacturer - '" + getManufacturer() + '\'' +
                ", price = " + getPrice() +
                ", material =" + getMaterial() +
                ", color =" + getColor() +
                '}';
    }
}