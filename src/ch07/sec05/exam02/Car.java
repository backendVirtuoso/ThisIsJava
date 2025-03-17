package ch07.sec05.exam02;

public class Car {
    public int speed;
    public void speedUp() {
        speed += 1;
    }
    public final void stop() {
        System.out.println("Car stopped");
        speed = 0;
    }
}
