package by.it_academy.lesson7;

public class ReverseText {

    public static void main(String[] args) {
        String text = "something happened";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            stringBuilder.append(text.charAt(i));
        }
        System.out.print(stringBuilder);
    }

}

