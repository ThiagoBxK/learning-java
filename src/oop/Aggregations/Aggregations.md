### Aggregation
A agregação é uma relação em que um objeto contem outro, mas ambos podem existir independentemente

- Um carrinho de compras pode existir com ou sem produtos, é produtos podem existir com ou sem carrinhos de compras

```java
public class ShoppingCart {  
    public ArrayList<IProduct> products;  
  
    public ShoppingCart() {  
        this.products = new ArrayList<>();  
    }  
  
    public void addProduct(IProduct product) {  
        products.add(product);  
    }  
  
    public double getTotal() { 
	    /// ...
    }  
}
```

Criamos um carrinho de compras, ele pode existir mesmo que não exista produtos nele

```java
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
```

Criamos um game product que pode existir sem a necessidade de um carrinho de compras

```java
ShoppingCart shoppingCart = new ShoppingCart();  
  
shoppingCart.addProduct(new GameProduct("The Last of Us™ Parte II Remastered", 199.9));  
shoppingCart.addProduct(new GameProduct("Marvel's Spider-Man 2", 249.9));   
  
System.out.printf("Shopping cart total: %s", shoppingCart.getTotal());
```

Podemos adicionar ou remover jogos do nosso carrinho de compras sem necessariamente termos uma composição