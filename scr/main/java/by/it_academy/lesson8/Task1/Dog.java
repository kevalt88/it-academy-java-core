package by.it_academy.lesson8.Task1;

class Dog extends Animal implements NoiseCapable {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }
    public void bark(){
        System.out.println(name() + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
