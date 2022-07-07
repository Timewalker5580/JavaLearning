package model.item.impl;

import model.item.Accessoryable;

public class Accessory implements Accessoryable {
    private final String name;
    private final String manufacturer;
    private final double price;
    private final String material;

    public Accessory(String name, String manufacturer, double price, String material) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "name - '" + name + '\'' +
                ", manufacturer - '" + manufacturer + '\'' +
                ", price = " + price +
                ", material =" + material +
                '}';
    }
}