package by.it_academy.lesson6;

public class ReverseText {
    public static void main(String[] args) {
        String text = "something happened";
        char[] ch = text.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(text.charAt(i));
            System.out.print(stringBuilder);
        }

    }
}

