package labotory_11.vehicle;

import labotory_11.input.Input;

abstract public class Vehicle {

    protected final int consumption;
    protected final int fuel;
    protected int fuelNow;

    Vehicle(int f, int c) {
        consumption = c;
        fuel = f;
        fuelNow = 0;
        if (c > f) {
            System.out.println("расход превышает емкость бака, машина не поедет");
        }
    }

    abstract void move();

    abstract void refuel();

    abstract void honk();

    abstract void menu(Input input);
}
