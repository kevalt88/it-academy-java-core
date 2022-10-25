package by.it_academy.lesson9.Task2;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(Suit.CLUB, 10);
        System.out.println(card);
        Card card1 = new Card(Suit.DIAMOND, 14);
        System.out.println(card1);
        Card card2 = new Card(Suit.HEART, 12);
        System.out.println(card2);
        Card card3 = new Card(Suit.SPADE, 5);
        System.out.println(card3);
    }
}
