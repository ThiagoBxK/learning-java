package data_structures.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] agrs) {
        // ArrayLists
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Carol");

        System.out.println(names);

        // LinkedLists
        List<Integer> ages = new LinkedList<>();

        ages.add(18);
        ages.add(20);

        System.out.println(ages);
    }
}
