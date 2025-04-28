## Arrays

`Arrays` são estruturas de dados que permitem armazenar vários valores do mesmo tipo em uma única variável.

Índice - Os valores são acessados e alterados através de índices
- O primeiro elemento de um `Array` sempre inicia com índice 0;
- Em JAVA `Arrays` são criados com tamanhos fixos, não é possível adicionar ou remover um elemento após sua criação;
- Os valores podem ser alterados;

`Exemplo:` Criamos um `Array` apenas com números inteiros, e inicializamos ele com valores de 1 a 5, agora temos um `Array` de 4 índices e com tamanho 5.

```java
int[] numbers = new int[]{1, 2, 3, 4, 5};    

System.out.printf("Tamanho do array: %s", numbers.length);

// Alterando valor do índice 0 que seria 1 para 0
numbers[0] = 10;

// Visualizar na tela no formato String
        System.out.println(Arrays.toString(numbers)); 
```
