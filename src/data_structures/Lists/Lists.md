### Lists

Uma **List** em Java representa uma coleção de elementos onde os dados podem ser acessados através de índices, semelhante a um array. A vantagem é a sua flexibilidade de adicionar e remover elementos de forma dinâmica, sem precisar se preocupar com o tamanho fixo, como ocorre nos arrays.

- A ordem de inserção é preservada.
- Permite elementos duplicados.
- O tamanho é dinâmico, ou seja, a lista pode crescer ou diminuir conforme elementos são adicionados ou removidos.
#### ArrayList
Usamos o ArrayList para criar uma lista dinâmica e adicionar elementos facilmente.
```java
List<String> names = new ArrayList<>();  
  
names.add("Alice");  
names.add("Bob");  

System.out.println(names);
```
O ArrayList já formata os dados em string automaticamente, sem precisar de `Arrays.toString()`.

#### LinkedList
A LinkedList também é uma lista dinâmica, mas com desempenho otimizado para inserções e remoções.
```java
List<Integer> ages = new LinkedList<>();  
  
ages.add(18);  
ages.add(20);  
  
System.out.println(ages);
```
