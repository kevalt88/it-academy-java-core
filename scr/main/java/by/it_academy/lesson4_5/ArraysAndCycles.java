package by.it_academy.lesson4_5;

public class ArraysAndCycles {
    public static void main(String[] args) {
        int[] number = new int[]{-2, 1, 5, 8, 9, -5, 4};
        int summaryOfNumbers = 0;
        for (int i = 0; i < number.length; i++) {
            summaryOfNumbers += number[i];
        }
        System.out.println(summaryOfNumbers);
    }
}
