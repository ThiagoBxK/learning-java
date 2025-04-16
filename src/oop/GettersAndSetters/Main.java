package oop.GettersAndSetters;

public class Main {
    public static void main(String[] args) {
        GettersAndSetters gettersAndSetters = new GettersAndSetters("Unknown");

        gettersAndSetters.sayHello(); // Hello Unknown!
        gettersAndSetters.setName("John Doe");
        System.out.printf(gettersAndSetters.getName()); // Thiago
    }
}
