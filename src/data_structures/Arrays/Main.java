package data_structures.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        System.out.printf("Tamanho do Array: %s", numbers.length);

        // Alterando valor do índice 0 que seria 1 para 0
        numbers[0] = 10;

        // Visualizar na tela no formato String
        System.out.println(Arrays.toString(numbers));
    }
}
