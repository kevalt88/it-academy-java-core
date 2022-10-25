package by.it_academy.lesson9.Task1;

public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    public void barks() {
        System.out.println(name() + " barks");
    }

    @Override
    public String name() {
        return super.name();
    }
}
