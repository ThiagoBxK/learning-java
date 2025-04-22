### Abstract Class

Classes abstratas são classes que serve como modelo para outras classes, Elas podem definir métodos com ou sem implementações (métodos abstratos e concretos)

- Não pode ser instanciada diretamente
- Toda classe que estender deve conter os mesmos métodos da classe abstrata

```java
public abstract class AbstractPerson {  
    public String name;  
  
    public String getName() {  
        return this.name;  
    };  
  
    public void setName(String newName) {  
        this.name = newName;  
    }  
  
    abstract void sayHello();  
}
```

Criamos a classe `AbstractPerson`, que tem alguns métodos: `getName` e `setName`, que são **métodos concretos** ou seja, todas as classes que estenderem `AbstractPerson` vão herdar e poder usar esses métodos diretamente. Já o método `sayHello` é um **método abstrato**, ou seja, ele não tem implementação na classe abstrata, e todas as subclasses são obrigadas a sobrescrevê-lo, implementando sua própria versão do `sayHello`.

```java
public class Person extends AbstractPerson {  
    public Person(String name) {  
        this.name = name;  
    }  
  
    @Override  
    public void sayHello() {  
        System.out.printf("Hello %s \n", this.name);  
    }  
}
```

Criamos a classe `Person` que estende de `AbstractPerson`, ela agora contem os métodos `getName` e `setName` e cria uma implementação para o método `sayHello` sobrescrevendo utilizando [[Annotations]] `@Override`