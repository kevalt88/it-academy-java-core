package by.it_academy.lesson6;

public class Whistle {
    private final String sound;

    public Whistle(final String sound) {
        this.sound = sound;
    }

    public void sound() {
        System.out.println(sound);
    }

    public static void main(String[] args) {
        final Whistle whistle = new Whistle("sssssss");
        whistle.sound();
    }
}






