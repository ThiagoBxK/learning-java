package oop.OverloadedConstructors;

public class OverloadedConstructors {
    public OverloadedConstructors() {
        System.out.println("Hello Unknow!");
    };

    public OverloadedConstructors(String name) {
        System.out.printf("Hello %s! \n", name);
    };
}
