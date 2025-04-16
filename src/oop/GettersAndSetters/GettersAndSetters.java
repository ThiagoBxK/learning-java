package oop.GettersAndSetters;

public class GettersAndSetters {
    private String name;

    public GettersAndSetters(String name) {
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
