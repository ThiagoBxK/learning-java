package data_structures.ObjectArrays;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    };

    public void setName(String newName) {
        name = newName;
    };

    public void sayHello() {
        System.out.printf("Hello %s! \n", this.name);
    }
}