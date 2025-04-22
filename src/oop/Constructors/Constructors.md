### Constructors

Construtores são métodos dentro de uma determinada classe usados para inicializar objetos é seus valores, Eles são chamados automaticamente quando a classe é instanciada

- O construtor deve ter exatamente o mesmo nome da classe
- É possível passar parâmetros para o construtor
- Não possui retorno

Criamos uma classe chamada `Person` que automaticamente quando instanciada printa a mensagem `Hello World!`.
```java
public class Person {  
    public Person() {  
        String message = "Hello World!";  
        System.out.println(message);  
    }
}
```

Instanciando uma nova `Person`
```java
Person person = new Person();
```