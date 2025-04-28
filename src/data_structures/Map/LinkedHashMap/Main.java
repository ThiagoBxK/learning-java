package data_structures.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> people = new LinkedHashMap<>();

        people.put("John", "Engineer");
        people.put("Maria", "Doctor");

        System.out.println(people);
    }
}
