package labotory_11;

import java.util.Scanner;

abstract public class Vehicle {

    protected final int consumption;
    protected final int fuel;
    protected int fuelNow;

    Vehicle(int f, int c) {
        consumption = c;
        fuel = f;
    }

    void move() {
        if (fuelNow >= consumption) {
            System.out.println("Вы проехали 100 км");
            fuelNow -= consumption;
            if (fuelNow < 0) fuelNow = 0;
            System.out.println("Оставшееся топливо " + fuelNow + "/" + fuel + "л");
        } else System.out.println("Недостаточно топлива, нужно заправиться");
    }

    void refuel() {
        fuelNow = fuel;
        System.out.println("Вы заправились");
        System.out.println("Оставшееся топливо " + fuelNow + "/" + fuel + "л");
    }

    abstract void honk();

    abstract void menu(Scanner scanner);
}
