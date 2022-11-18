package by.it_academy.lesson11.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("5", "a", "15", "c", "25");
        for (String item : list) {
            try {
                System.out.println(Integer.parseInt(item));
            } catch (NumberFormatException e) {
                System.out.println(item + " it's not a number");
            }

        }
    }
}
