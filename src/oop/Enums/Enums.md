### Enums

Um **`enum`** representa um conjunto fixo de valores, como dias da semana, de forma segura e organizada. Ele garante que apenas valores predefinidos sejam usados, evitando erros e aumentando a clareza do código.

```java
public enum Day {  
    MONDAY,  
    TUESDAY,  
    WEDNESDAY,  
    THURSDAY,  
    FRIDAY,  
    SATURDAY,  
    SUNDAY  
}
```

Usar **`enums`** em vez de **`String`** evita erros futuros, pois só permite valores válidos, melhora a segurança e facilita a manutenção, centralizando mudanças em um único local.

Existe outra forma de criar `enums`, ela é mais complexa e permite incluir atributos, métodos e construtores, Ele permite associar comportamentos dados adicionais a cada valor do `enum` tornando mais flexível

```java
public enum Day {  
    MONDAY("Start of the week", 1),  
    TUESDAY("Second day", 2),  
    WEDNESDAY("Middle of the week", 3),  
    THURSDAY("Almost there", 4),  
    FRIDAY("End of work week", 5),  
    SATURDAY("Weekend!", 6),  
    SUNDAY("Rest day", 7);  
  
    private final String description;  
    private final int dayNumber;  
  
    Day(String description, int dayNumber) {  
        this.description = description;  
        this.dayNumber = dayNumber;  
    }  
  
    public String getDescription() {  
        return description;  
    }  
  
    public int getDayNumber() {  
        return dayNumber;  
    }  
}
```

Nesse `enum` além dos dias da semana também temos uma breve descrição é o numero do dia da semana, que podemos acessar via `getDescription`, `getDayNumber` como se fossem uma classe

```java
Day today = Day.MONDAY;  
System.out.printf(today.getDescription());
```

Agora ao acessar o dia da semana podemos utilizar o método `getDescription` para acessar a descrição daquele dia da semana