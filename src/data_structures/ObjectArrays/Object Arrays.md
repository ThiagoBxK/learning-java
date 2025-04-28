### Object Arrays

Em JAVA, `Arrays`, `Lists`, `HashMap` e outras coleções também podem armazenar objetos ou instancias de classes.

`Exemplo:` Criamos uma classe `Person`, com alguns métodos como `getName` e `sayHello`.

```java
public class Person { ... }
```

Definimos um novo `Array` do tipo `Person` e inserimos três valores.

```java
Person[] persons = new Person[]{  
        new Person("Alice"),  
        new Person("Bob"),   
        new Person("Carol")  
};
```

Agora podemos acessar os índices e usar os métodos da classe de forma mais flexível sem manipular tipo de dados primitivos.

```java
System.out.println(persons[0].getName());
```
