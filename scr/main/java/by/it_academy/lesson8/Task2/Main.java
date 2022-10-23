package by.it_academy.lesson8.Task2;

public class Main {
    public static void main(String[] args) {
        final Counter counter = new Counter();
        System.out.println(counter.value());
        counter.increase();
        System.out.println(counter.value());
        counter.decrease();
        System.out.println(counter.value());
    }
}
