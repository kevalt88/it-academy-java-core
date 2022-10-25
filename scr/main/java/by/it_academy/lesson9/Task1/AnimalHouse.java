package by.it_academy.lesson9.Task1;

public class AnimalHouse<T extends Animal> {
    private T someAnimal;

    public void setAnimal(T someAnimal) {
        this.someAnimal = someAnimal;
    }

    public T getAnimal() {
        return someAnimal;
    }
}

