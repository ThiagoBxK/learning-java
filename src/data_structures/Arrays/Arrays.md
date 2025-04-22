### Arrays

Arrays são estruturas de dados que permitem armazenar vários valores do mesmo tipo em uma única variável. Cada valor é armazenado em uma posição específica (índice) que pode ser acessado ou alterado.

- O primeiro elemento de um array sempre começa com índice 0.
- O tamanho do array é fixo, ou seja, definido no momento da criação e não pode ser alterado depois.
- Não é possível adicionar ou remover elementos, mas é possível modificar os valores existentes usando seus índices.

```java
int[] numbers = new int[]{1, 2, 3, 4, 5};    

System.out.printf("Tamanho do array: %s", numbers.length);   
numbers[0] = 10;
```

Iniciamos um novo `Array` de inteiros, e adicionamos os valores [1,2,3,4,5], printamos o tamanho do `Array` usando o método `.length`, após isso adicionamos um novo valor ao `Indice` 0 do `Array` para 10