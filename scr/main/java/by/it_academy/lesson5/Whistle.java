package by.it_academy.lesson5;

public class Whistle {
    private final String sound;

    public Whistle(final String sound) {
        this.sound = sound;
    }

    public void testOfSound() {
        System.out.println(sound);
    }

    public static void main(String[] args) {
        final Whistle whistle = new Whistle("sssssss");
        whistle.testOfSound();
    }
}






