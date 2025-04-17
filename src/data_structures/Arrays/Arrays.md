data_structures.Arrays são estruturas de dados que permitem armazenar vários valores do mesmo tipo em uma única variável. Cada valor é armazenado em uma posição específica (índice) que pode ser acessado ou alterado.

- O primeiro elemento de um array sempre começa com índice 0.
- O tamanho do array é fixo, ou seja, definido no momento da criação e não pode ser alterado depois.
- Não é possível adicionar ou remover elementos, mas é possível modificar os valores existentes usando seus índices.


```java
// Inicializa o array com os valores 1, 2, 3, 4, 5 
int[] numbers = new int[]{1, 2, 3, 4, 5};    

// Obtem o tamanho do array (quantidade de elementos) 
System.out.printf("Tamanho do array: %s", numbers.length);   

// Altera o valor do índice 0 (que é 1) para 10 
numbers[0] = 10;
```


Quando você tenta imprimir um array diretamente, o Java mostra o endereço de memória onde o array está armazenado.

```java
System.out.println(numbers); // Ex: [I@10df1934]
```

Para obter os valores de um array, usa se o metodo data_structures.Arrays, que tem submetodos com diversas formas de manipular o array

```java
System.out.println(data_structures.Arrays.toString(numbers));  // Exibe: [10, 2, 3, 4, 5]
```