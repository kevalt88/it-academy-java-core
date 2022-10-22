package by.it_academy.lesson8.Task2;

public class Counter {
    private int value;

    Counter(int startValue) {
        this.value = startValue;
    }

    Counter() {
        this(0);
    }

    public int Value() {
        return value;
    }

    void increase() {
        increase(1);
    }

    void decrease() {
        decrease(1);
    }

    void increase(int increaseBy) {
        this.value = value + increaseBy;
    }

    void decrease(int decreaseBy) {
        this.value = value - decreaseBy;
    }
}
