Composição é uma relação forte onde um objeto faz parte de outro e depende dele para existir.

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

A classe `Computer` possui um atributo `Processor`.  
Essa é uma relação de **composição**: sempre que um `Computer` for criado, um `Processor` também será, o `Processor` só existe como parte do `Computer`, e sem ele um computador não pode funcionar corretamente.