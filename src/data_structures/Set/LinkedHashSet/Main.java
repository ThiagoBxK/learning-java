package data_structures.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> people = new LinkedHashSet<>();

        people.add("John");
        people.add("Maria");

        System.out.println(people);
    }
}
