package oop.Aggregations;
import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<IProduct> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(IProduct product) {
        products.add(product);
    }

    public double getTotal() {
        return products.stream()
                .mapToDouble(IProduct::getPrice)
                .reduce(0.0, Double::sum);
    }
}
