package oop.Aggregations;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(new GameProduct("The Last of Us™ Parte II Remastered", 199.9));
        shoppingCart.addProduct(new GameProduct("Marvel's Spider-Man 2", 249.9));
        shoppingCart.addProduct(new GameProduct("Hogwarts Legacy", 299.9));
        shoppingCart.addProduct(new GameProduct("God of War Ragnarök", 279.9));
        shoppingCart.addProduct(new GameProduct("Elden Ring", 349.9));

        System.out.printf("Shopping cart total: %s", shoppingCart.getTotal());
    }
}
