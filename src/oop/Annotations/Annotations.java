package oop.Annotations;

public class Annotations extends Example {
    public Annotations(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.printf("Hello %s, welcome to Annotations tutorial! \n", this.name);
    };

    @Deprecated
    public void sayHello(String name) {
        System.out.printf("Hello %s, welcome to Annotations tutorial! \n", name);
    }

}
