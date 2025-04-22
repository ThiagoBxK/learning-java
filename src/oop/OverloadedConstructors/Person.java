package oop.OverloadedConstructors;

public class Person {
    public Person() {
        System.out.println("Hello Unknow!");
    }

    public Person(String name) {
        System.out.printf("Hello %s! \n", name);
    }
}
