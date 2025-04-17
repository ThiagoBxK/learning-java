package data_structures.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // HashMap
        Map<String, String> names = new HashMap<>();
        names.put("John", "Doe");

        System.out.println(names.get("Jhon"));

        // LinkedHashMap
        Map<String, String> country = new LinkedHashMap<>();
        country.put("Brazilian", "PT-BR");

        System.out.println(country.get("Brazilian"));
    }
}
