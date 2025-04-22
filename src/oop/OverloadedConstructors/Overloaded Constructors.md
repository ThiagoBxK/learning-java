Overloaded Constructors (sobrecarga de construtores) é quando temos dois ou mais construtores em uma mesma classe, com diferentes entradas de parâmetros ou comportamentos internos distintos.

-  Um construtor deve ter sempre o mesmo nome da classe.
-  É possível ter múltiplos construtores com diferentes tipos e quantidades de parâmetros.

```java
public class Person {
    public Person() {
        System.out.println("Hello Unknown!");
    }

    public Person(String name) {
        System.out.printf("Hello %s! \n", name);
    }
}
```


Criamos uma classe chamada `Person` que há dois construtores, um dele não recebe parâmetros e outro recebe um parâmetro de tipo `String` chamado `name`, cada construtor tem diferentes responsabilidades.

Se instanciarmos uma nova `Person` sem parâmetros, o JAVA automaticamente identifica qual construtor deve ser chamado.

```java
Person personA = new Person(); // Hello Unknown!
```

Agora se instanciarmos com um parâmetro de tipo `String`, vamos obter um resultado diferente.

```java
Person personB = new Person("John Doe"); // Hello John Doe!
```

