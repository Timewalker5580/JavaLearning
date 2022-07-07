import java.util.Comparator;

public abstract class BikeDetails{
    private final String name;
    private final double weight;
    private final int price;
    private final String manufacture;

    public BikeDetails(String name, double weight, int price, String manufacture) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.manufacture = manufacture;
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }
    public int getPrice() { return price; }
    public String getManufacture() { return manufacture; }

    public abstract void PrintInfo();

}