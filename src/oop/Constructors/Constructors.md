Construtores são métodos dentro de uma classe usados para inicializar objetos. Eles são chamados automaticamente quando a classe é instanciada, e servem para definir valores iniciais para os atributos do objeto. 

-  O construtor deve ter o mesmo nome da classe.
-  É possível passar parâmetros para o construtor.
-  Não possui retorno.

```java
public class Constructor {  
	// Construtor sem parâmetro
    public Constructor() {  
        String message = "Hello Wolrd!";  
        System.out.println(message);  
    }
}
```