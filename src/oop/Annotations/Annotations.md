
### @Override
Indica que o método está sobrescrevendo outro método da superclasse ou interface

A superclasse define o método `sayHello()` que apenas imprime uma saudação simples
```java
public void sayHello() {  
    System.out.printf("Hello %s! \n", this.name);  
}
```

Na subclasse, o método é sobrescrito para adicionar uma nova mensagem, incluindo "Bem-vindo ao tutorial de Annotations!":
```java
@Override  
public void sayHello() {  
    System.out.printf("Hello %s, welcome to Annotations tutorial! \n", this.name);  
};
```

### @Deprecated
Indica que o método ou classe está obsoleto e não deve ser utilizado em novas implementações, ele ainda pode ser utilizado mais com um alerta, para dizer que o método pode ser removido futuramente

Nesse exemplo o método precisa de um parâmetro "name", essa forma esta obsoleta
```java
@Deprecated  
public void sayHello(String name) {  
    System.out.printf("Hello %s, welcome to Annotations tutorial! \n", name);  
}
```

Agora ele usa "this.name" que é uma propriedade da própria classe
```java  
public void sayHello() {  
    System.out.printf("Hello %s, welcome to Annotations tutorial! \n", this.name);  
}
```