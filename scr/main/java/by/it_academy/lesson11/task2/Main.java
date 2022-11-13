package by.it_academy.lesson11.task2;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        System.out.println("temperatureSensor.isOn() = " + temperatureSensor.isOn());
        temperatureSensor.setOn();
        System.out.println("temperatureSensor.read() = " + temperatureSensor.read());

        AverageSensor averageSensor = new AverageSensor();
        averageSensor.addSensor(new StandardSensor(25));
        averageSensor.addSensor(new TemperatureSensor());
        averageSensor.setOn();
        System.out.println(averageSensor.read());
    }
}
