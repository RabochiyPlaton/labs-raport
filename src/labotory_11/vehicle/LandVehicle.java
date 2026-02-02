package labotory_11.vehicle;

import labotory_11.input.Input;

public class LandVehicle extends Vehicle{

    LandVehicle(int f, int c) {
        super(f, c);
    }

    @Override
    void honk() {

    }

    @Override
    void menu(Input input) {

    }

    @Override
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
}
