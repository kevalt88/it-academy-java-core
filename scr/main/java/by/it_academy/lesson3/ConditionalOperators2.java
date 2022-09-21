package by.it_academy.lesson3;

public class ConditionalOperators2 {
    public static void main(String[] args) {
        String grade = "G";
        switch (grade) {
            case "A":
                System.out.println("Distinction");
                break;
            case "B":
            case "C":
                System.out.println("First class");
                break;
            case "D":
                System.out.println("You have passed");
                break;
            case "F":
                System.out.println("Fail. Try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

    }
}
