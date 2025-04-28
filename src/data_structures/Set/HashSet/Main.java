package data_structures.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> people = new HashSet<>();

        people.add("John");
        people.add("Maria");

        System.out.println(people);
    }
}
