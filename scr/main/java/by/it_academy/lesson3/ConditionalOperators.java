package by.it_academy.lesson3;

public class ConditionalOperators {
    public static void main(String[] args) {
        int giftValue = 10000;
        int taxAmount = 0;
        if (giftValue < 5000) {
            System.out.println(taxAmount);
        } else if (5000 <= giftValue && giftValue <= 25000) {
            System.out.println(100 + (giftValue - 5000) * 0.08);
        } else if (giftValue > 25000) {
            System.out.println(1700 + (giftValue - 5000) * 0.1);
        }

    }
}
