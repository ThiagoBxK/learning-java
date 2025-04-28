## HashMap

`HashMap` é uma estrutura de dados que guarda pares de chave e valor. Cada chave deve ser única é servem para acessar seus respectivos valores.

- Cada chave deve ser única.
- Não garante a ordem de inserção.

```java
Map<K, V> // Key - Value
```

```java
Map<String, String> people = new HashMap<>();

people.put("John", "Engineer");
people.put("Maria", "Doctor");
```