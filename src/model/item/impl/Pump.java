package model.item.impl;

import model.item.Pumpable;

public class Pump extends Accessory implements Pumpable {

    private final double pressure;

    public Pump(String name, String manufacturer, double price, String material, double pressure) {
        super(name, manufacturer, price, material);
        this.pressure = pressure;
    }

    @Override
    public double getPressure() {
        return pressure;
    }


    @Override
    public String toString() {
        return "Pump{" +
                "name - '" + getName() + '\'' +
                ", manufacturer - '" + getManufacturer() + '\'' +
                ", price = " + getPrice() +
                ", material =" + getMaterial() +
                ", pressure =" + getPressure() +
                '}';
    }
}