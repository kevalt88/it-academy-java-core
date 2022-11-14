package by.it_academy.lesson10.task1;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(list);
        System.out.println(average(list));
        printlnRange(list, 1, 5);
    }

    private static double average(List<Integer> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum / numbers.size();
    }

    private static void printlnRange(List<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }

    }
}
