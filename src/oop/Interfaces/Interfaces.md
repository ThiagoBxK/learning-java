### Interfaces

Uma interface em JAVA é um tio de classe que define um contrato. Ela especifica métodos que uma classe deve implementar, mas não fornece a implementação desses métodos.

-  Não pode ter corpo de método (só assinatura)

```java
public interface PaymentMethod {  
    void processPayment(double amount);  
  
    default boolean validatePayment(double amount) {  
        if (amount > 0) {  
            System.out.printf("Payment of $%s is valid. \n", amount);  
            return true;  
        } else {  
            System.out.println("Invalid payment amount.");  
            return false;  
        }  
    }  
}
```

Criamos uma classe de `PaymentMethod`, todas classes que implementar essa interface obrigatoriamente precisa ter um método `processPayment` com um parâmetro `amount` e por padrão vem com um método `approvedPayment`

```java
public class CreditCardPayment implements PaymentMethod {  
    public void processPayment(double amount) {  
        System.out.println("Processing credit card payment of $" + amount);  
    }  
}
```

Criamos uma nova classe `CreditCardPayment` que simboliza a forma de pagamento no cartão de credito, e implementamos o `processPayment`, como em [[Abstract Class]] por baixo dos panos existe um método `validatePayment`