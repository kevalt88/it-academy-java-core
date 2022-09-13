package by.it_academy.lesson2;

public class Main {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 7.0;
        System.out.println("First value = " + a);
        System.out.println("Second value = " + b);
        System.out.println("Multiplication = " + a * b);
        System.out.println("Division =" + a / b);

        int c = 8;
        int d = 2345;
        int i = 3;
        double f = (c + d) / i;
        double mod = f % (-6);
        System.out.println("Result of division " + f);
        System.out.println("Remainder of the division " + mod);
        System.out.println(mod >= -10);
        System.out.println(mod < 9);
        System.out.println(mod == 0);
        System.out.println(mod != -3);
    }
}
