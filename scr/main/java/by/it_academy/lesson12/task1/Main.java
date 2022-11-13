package by.it_academy.lesson12.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = readFile();
        System.out.println(numbers);
        List<Integer> cubes = cubes(numbers);
        System.out.println(cubes);
        writeToFile(cubes);
    }

    private static List<Integer> readFile() {
        List<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("scr/main/resources/file.txt"))) {
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private static List<Integer> cubes(List<Integer> numbers) {
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            list2.add(numbers.get(i) * numbers.get(i) * numbers.get(i));
        }
        return list2;
    }

    private static void writeToFile(List<Integer> numbers) {
        try (FileWriter myFile = new FileWriter("myFile.txt")) {
            for (int i = 0; i < numbers.size(); i++) {
                final String str = Integer.toString(numbers.get(i));
                myFile.write(str);
                myFile.write(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

