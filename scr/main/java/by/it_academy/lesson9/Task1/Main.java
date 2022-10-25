package by.it_academy.lesson9.Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sleep();
        Dog dog = new Dog();
        dog.barks();
        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();
        dogHouse.setAnimal(dog);
        Dog dog1 = dogHouse.getAnimal();
        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
        catHouse.setAnimal(cat);
    }
}
