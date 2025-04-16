Classes abstratas são classes que serve como modelo para outras classes, Elas podem definir métodos com ou sem implementações (métodos abstratos e concretos)

- Não pode ser instanciada diretamente
- Toda classe que extender deve conter os mesmos métodos da classe abstrata


Todas as classes que extender **AbstractClass** por padrão vão conter os métodos "getName" e "setName", esses métodos podem ser modificados usando [[@Override]]

```java
public abstract class AbstractClass {  
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

O método "sayHello" também é abstrato, sendo assim as classes que utilizarem **AbstractClass** terão que obrigatoriamente implementar esse método usando [[@Override]] para garantir que seja sobrescrevido.

```java
public class ConcretClass extends AbstractClass {  
    public ConcretClass(String name) {  
        this.name = name;  
    }  
  
    @Override
    public void sayHello() {  
        System.out.printf("Hello %s \n", this.name);  
    }  
}
```

Agora todos as classes que extenderem de AbstractClass por baixo dos panos terao os metodos setName e getName é tambem obrigatoriamente precisaram implementar sayHello