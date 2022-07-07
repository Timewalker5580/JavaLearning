package model;

import model.item.impl.Accessory;
import model.item.impl.Flash;
import model.item.impl.Lock;
import model.item.impl.Pump;


public class BicycleAccessory {
    public static void main(String[] args) {

        Accessory accessory1 = new Accessory("Accessory", "Manufactor", 100, "plastic");
        System.out.println(accessory1);

        Flash flash1 = new Flash("Ліхтар задній Jing Yi JY-6028T", "China", 207, "wood", "black");
        System.out.println(flash1);

        Pump pump1 = new Pump("Насос підлоговий Bee Pumps ZF-042 з манометром", "Ukraine", 367, "gold", 9.6);
        System.out.println(pump1);

        Lock lock1 = new Lock("Кодовий замок TRINX TL04 з кріпленням", "Ukraine", 325, "iron", 1200,  12);
        System.out.println(lock1);
    }
}

