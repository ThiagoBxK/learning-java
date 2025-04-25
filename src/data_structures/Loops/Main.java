package data_structures.Loops;

public class Main {
    public static void main(String[] args) {
        String[] pets = new String[]{"Dog", "Cat", "Bird"};

        // FOR
        for (int index = 0; index < 10; index++) {
            System.out.println("Hello World!");
        }

        int stepsA = 0;
        // WHILE
        while(stepsA < 10) {
            // ...Operation
            stepsA++;
        }

        int stepsB = 0;
        // DO-WHILE
        do {
            // ... Operation
            stepsB++;
        } while (stepsB < 10);
    }
}
