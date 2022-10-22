package by.it_academy.lesson8.Task2;

public class Main {
    public static void main(String[] args) {
        final Counter counter = new Counter();
        System.out.println(counter.Value());
        counter.increase();
        System.out.println(counter.Value());
        counter.decrease();
        System.out.println(counter.Value());
    }
}
