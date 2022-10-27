package by.it_academy.lesson9.task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();
        dogHouse.setAnimal(dog);
        Dog dog1 = dogHouse.getAnimal();
        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
        catHouse.setAnimal(cat);
    }
}
