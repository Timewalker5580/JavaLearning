package ua.lviv.iot.bicycleaccessory.model.item.impl;

import ua.lviv.iot.bicycleaccessory.model.item.Lockable;

public class Lock extends Accessory implements Lockable {
    private final int size1;
    private final int size2;

    public Lock(String name, String manufacturer, double price, double weight, int size1, int size2) {
        super(name, manufacturer, price, weight);
        this.size1 = size1;
        this.size2 = size2;
    }

    public int getSize1() { return size1; }
    public int getSize2() { return size2; }

    @Override
    public String toString() {
        return "Lock{" +
                "name - '" + getName() + '\'' +
                ", manufacturer - '" + getManufacturer() + '\'' +
                ", price = " + getPrice() +
                ", weight =" + getWeight() +
                ", size 1 =" + getSize1() +
                ", size 2 =" + getSize2() +
                '}';
    }
}