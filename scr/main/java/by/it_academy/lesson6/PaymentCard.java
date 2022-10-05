package by.it_academy.lesson6;

public class PaymentCard {
    private double balance;
    double x = 500;

    PaymentCard(double balance) {
        this.balance = x;
    }

    @Override
    public String toString() {
        return "The card has a balance of" + x;
    }

    public void eatAffordably() {
        double a = x - 2.6;
        if (a > 0)
            System.out.println(a);
    }

    public void eatHeartily() {
        double b = x - 4.6;
        if (b > 0)
            System.out.println(b);
    }

    public void addMoney() {
        double salary = 1000;
        double sumBalance = x + salary;
        if (salary > 0)
            System.out.println(sumBalance);
        if (salary < 0)
            System.out.println(x);

    }

    public static void main(String[] args) {
        final PaymentCard paymentCard = new PaymentCard(args.length);
        paymentCard.eatAffordably();
        paymentCard.eatHeartily();
        paymentCard.addMoney();
    }
}


