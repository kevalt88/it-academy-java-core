package by.it_academy.lesson9.Task1;

public class Cat extends Animal {

    public Cat() {
        super("Cat");
    }

    public void sleep() {
        System.out.println(name() + " sleeps");
    }

    @Override
    public String name() {
        return super.name();
    }
}


