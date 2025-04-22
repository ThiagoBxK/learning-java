### Object Arrays

Um **array de objetos** é uma estrutura que armazena múltiplos objetos de uma mesma classe em uma sequência, permitindo acessar e manipular cada objeto pelo seu índice.

```java
public class Person { ... }
```

Criamos uma classe `Person` com alguns métodos `getName`, `setName` e `sayHello`

```java
Person[] persons = new Person[]{  
        new Person("Alice"),  
        new Person("Bob"),  
        new Person("Carol")  
};
```

Agora criamos um array de objetos `Person`, e inserimos três valores.

```java
System.out.println(persons[0].getName());
```

Agora podemos acessar seus índices diretamente é executar os métodos da classe