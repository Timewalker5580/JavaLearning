package model.item.impl;

import model.item.Accessoryable;

public class Accessory implements Accessoryable {
    private final String name;
    private final String manufacturer;
    private final double price;
    private final double weight;

    public Accessory(String name, String manufacturer, double price, double weight) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.weight = weight;
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
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "name - '" + name + '\'' +
                ", manufacturer - '" + manufacturer + '\'' +
                ", price = " + price +
                ", weight =" + weight +
                '}';
    }
}