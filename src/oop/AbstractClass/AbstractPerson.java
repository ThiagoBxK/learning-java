package oop.AbstractClass;

public abstract class AbstractPerson {
    public String name;

    public String getName() {
        return this.name;
    };

    public void setName(String newName) {
        this.name = newName;
    }

    abstract void sayHello();
}
