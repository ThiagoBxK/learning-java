package data_structures.ObjectArrays;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Person("Alice"),
                new Person("Bob"),
                new Person("Carol")
        };

        System.out.println(persons.length);
        System.out.println(persons[0].getName());
    }
}
