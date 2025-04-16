Getters e Setters são metodos usados para acessar (get) e alterar (set) os valores de atributos de um objeto, de forma controlada e encapsulada

```java
public class GettersAndSetters {  
    private String name;  
    
    public GettersAndSetters(String name) {  
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

```java
GettersAndSetters gettersAndSetters = new GettersAndSetters("Unknown");

gettersAndSetters.getName(); // Unknown
gettersAndSetters.setName("John Doe");  
gettersAndSetters.sayHello(); // Hello John Doe!
```