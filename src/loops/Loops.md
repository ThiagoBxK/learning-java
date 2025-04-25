### Loops

Loops são estruturas de repetição que executam um bloco de código a cada iteração.
- Essas estruturas necessitam de uma condição para poder funçionar.

```java
for (int index = 0; index < 10; index++) {
    System.out.println("Hello World!");
}
```
`FOR` - Criamos uma variável numérica com valor zero, enquanto ela for menor que dez ela se auto incrementa e executa o bloco de código abaixo que seria pritnar "Hello World!".

```java
int steps = 0;
while(steps < 10) {
	System.out.println("Hello World");
    steps++;  
}
```

`WHILE` -  O while sempre será executado até que a sua condição seja falsa, primeiro ele verifica se steps e menor que 10, se sim ele executa o bloco de código abaixo e auto incrementa steps, se não ele para o loop.

```java
do {
	System.out.println("Hello World");
    steps++;  
} while(steps < 10);
```

`DO WHILE` - Tem a mesma ideia do while mais consiste em primeiro executar o bloco de código é depois verificar a condição.