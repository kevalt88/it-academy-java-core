package by.it_academy.lesson8.Task1;

public class Cat extends Animal implements NoiseCapable {
    public Cat (String name) {
        super(name);
    }

    public Cat() {
        super("Murzik");
    }
    public void purr(){
        System.out.println(name() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
