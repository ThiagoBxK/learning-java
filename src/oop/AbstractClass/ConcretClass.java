package oop.AbstractClass;

public class ConcretClass extends AbstractClass {
    public ConcretClass(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.printf("Hello %s \n", this.name);
    }
}
