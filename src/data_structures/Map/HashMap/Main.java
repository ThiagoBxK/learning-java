package data_structures.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();

        people.put("John", "Engineer");
        people.put("Maria", "Doctor");

        System.out.println(people);
    }
}
