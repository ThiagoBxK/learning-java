package data_structures.Arrays;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5};

        System.out.printf("Array size: %s \n", numbers.length);
        numbers[0] = 10;

        System.out.printf("Array address in memory: %s \n", numbers);
        System.out.printf("Array formated: %s \n", Arrays.toString(numbers));
    }
}
