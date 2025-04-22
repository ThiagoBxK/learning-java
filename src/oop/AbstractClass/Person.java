package oop.AbstractClass;

public class Person extends AbstractPerson {
    public Person(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.printf("Hello %s \n", this.name);
    }
}
