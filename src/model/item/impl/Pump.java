package model.item.impl;

import model.item.Pumpable;

public class Pump extends Accessory implements Pumpable {

    private final double pressure;

    public Pump(String name, String manufacturer, double price, double weight, double pressure) {
        super(name, manufacturer, price, weight);
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
                ", weight =" + getWeight() +
                ", pressure =" + getPressure() +
                '}';
    }
}