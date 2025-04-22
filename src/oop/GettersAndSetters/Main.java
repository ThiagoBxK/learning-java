package oop.GettersAndSetters;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Unknown");

        person.sayHello(); // Hello Unknown!
        person.setName("John Doe");
        System.out.printf(person.getName()); // John Doe
    }
}
