package oop.Aggregations;

public class GameProduct implements IProduct {
    private String name;
    private double price;

    public GameProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
