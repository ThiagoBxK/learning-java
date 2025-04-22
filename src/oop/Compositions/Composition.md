### Composition

Em Java, a composição é um tipo de relação entre classes onde uma classe contém ou possui outra classe como parte de si. Ou seja, uma classe depende de outra para funcionar, e a classe "contenedora" controla o ciclo de vida da classe que ela contém.

```java
public class Computer {  
    private Processor processor;  
    public boolean isPoweredOn = false;  
  
    public Computer() {  
        this.processor = new Processor();  
    }  

    public void turnOn() { ... }  
  
    public void turnOff() { ... }  
  
    public String poweredStatus() { ... }
}
```

- A classe **`Computer`** possui um atributo **`processor`** do tipo **`Processor`**. Isso configura uma relação de composição, onde o **`Computer`** tem um **`Processor`** como parte de si.

- A cada vez que a classe **`Computer`** é instanciada, ela automaticamente cria um **`Processor`** dentro dela, devido ao código no construtor `Computer()`.

- **Métodos como `turnOn`, `turnOff` e `poweredStatus`** controlam o estado do computador (ligado ou desligado).

- O **`Processor`** é um componente essencial do **`Computer`**, e sua criação depende diretamente da criação de um objeto **`Computer`**.