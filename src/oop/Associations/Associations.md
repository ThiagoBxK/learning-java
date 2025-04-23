### Association

A associação é uma relação onde objetos podem interagir, mas não dependem uns dos outros para existir.

- Uma pessoa pode conhecer como ligar um computador, mais não depende necessariamente da existência de um computador para também poder existir


```java
public class Computer { 
    public void turnOn() { ... }
}
```

```java
public class People {  
    public void turnOnComputer(Computer computer) {  
        computer.turnOn();  
    }  
}
```

A pessoa sabe ligar o computador, mas não precisa entender seu funcionamento interno.
