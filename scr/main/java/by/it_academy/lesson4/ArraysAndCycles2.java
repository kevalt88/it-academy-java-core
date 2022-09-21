package by.it_academy.lesson4;

public class ArraysAndCycles2 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 8};
        for (int numberOfStars : array) {
            if (numberOfStars == 4) {
                System.out.println("****");
            } else if (numberOfStars == 6)
                System.out.println("******");
            else if (numberOfStars == 8)
                System.out.println("********");
        }

    }
}
