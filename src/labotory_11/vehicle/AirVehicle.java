package labotory_11.vehicle;

import labotory_11.input.Input;

public class AirVehicle extends Vehicle{

    AirVehicle(int f, int c) {
        super(f, c);
    }

    @Override
    void move() {
        if (fuelNow >= consumption) {
            System.out.println("Вы пролетели 1000 км");
            fuelNow -= consumption;
            if (fuelNow < 0) fuelNow = 0;
            System.out.println("Оставшееся топливо " + fuelNow + "/" + fuel + "л");
        } else System.out.println("Недостаточно топлива, нужно заправиться");
    }

    @Override
    void honk() {

    }

    @Override
    void refuel() {
        fuelNow = fuel;
        System.out.println("Прибыл самолет заправщик. Вы заправились");
        System.out.println("Оставшееся топливо " + fuelNow + "/" + fuel + "л");
    }

    @Override
    void menu(Input input) {

    }
}
