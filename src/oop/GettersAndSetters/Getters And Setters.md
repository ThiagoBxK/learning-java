### Getters And Setters

Getters e Setters são métodos usados para acessar (get) e alterar (set) os valores de atributos de um objeto.

```java
public class Person {  
    private String name;  
  
    public Person(String name) {  
        this.name = name;  
    }  
  
    public String getName() {  
        return name;  
    };  
  
    public void setName(String newName) {  
        name = newName;  
    };  
  
    public void sayHello() {  
        System.out.printf("Hello %s! \n", this.name);  
    }  
}
```

Criamos uma classe chamada `Person`, com alguns métodos `getName` para obter o nome da pessoa, `setName` para alterar o nome da pessoa, `sayHello` para printar um `Hello` com o nome da pessoa.

```java
Person person = new Person("Unknown");  
  
person.sayHello(); // Hello Unknown!  
person.setName("John Doe");  
System.out.printf(person.getName()); // Thiago
```

Agora instanciamos uma nova pessoa com o nome de `Unknown`, printamos seu nome é em seguida alteramos, no final obtemos novamente o nome da pessoa usando `getName`

Com `getters` e `setters` podemos alterar valores de uma classe de forma mais controlada e encapsulada.