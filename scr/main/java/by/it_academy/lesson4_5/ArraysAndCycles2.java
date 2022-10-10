package by.it_academy.lesson4_5;

public class ArraysAndCycles2 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 6, 8};
        for (int i = 0; i < array.length; i++) {
            for (int h = 0; h < array[i]; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}