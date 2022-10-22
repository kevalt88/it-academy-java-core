package by.it_academy.lesson8.Task1;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void eat() {
        System.out.println(name + " eats");
    }
    public void sleep(){
        System.out.println(name + " sleeps");
    }
}
