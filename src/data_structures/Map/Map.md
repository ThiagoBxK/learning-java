É uma estrutura de dados que armazena pares de chave e valor. Cada chave deve ser única, mas os valores podem se repetir

-  Não permite chaves duplicadas

HashMap, dicionário chave e valor, ordem de inserção não é garantida
```java
Map<String, String> map = new HashMap<>();  
map.put("John", "Doe");

map.get("John") // Value: Doe
```

LinkedHashMap, dicionário de chave e valor, mantem a ordem de inserção
```java
Map<String, String> country = new LinkedHashMap<>();  
country.put("Brazilian", "PT-BR");  
  
System.out.println(country.get("Brazilian")); // Value: PT-BR
```