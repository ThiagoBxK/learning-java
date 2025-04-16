Overloaded Constructos (ou sobrecarga de construtores ) é quando temos dois ou mais construtores em uma mesma classe, com diferentes entradas de parâmetros ou comportamentos internos distintos.

- Um construtor deve ter sempre o mesmo nome da classe.
-  É possível ter múltiplos construtores com diferentes tipos e quantidades de parâmetros.
```java
public class OverloadedConstructors {
    public OverloadedConstructors() {  
        System.out.println("Hello Unknown!");  
    };  
    
    public OverloadedConstructors(String name) {  
        System.out.printf("Hello %s! \n", name);  
    };  
}
```

Dependendo de como a classe é instanciada, o Java escolhe o construtor correspondente, com base em parâmetros passados.