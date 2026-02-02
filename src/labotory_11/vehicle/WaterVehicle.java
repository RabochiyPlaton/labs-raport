package labotory_11.vehicle;

import labotory_11.input.Input;

public class WaterVehicle extends Vehicle{

    WaterVehicle(int f, int c) {
        super(f, c);
    }

    @Override
    void move() {
        if (fuelNow >= consumption) {
            System.out.println("Вы проплыли 500 км");
            fuelNow -= consumption;
            if (fuelNow < 0) fuelNow = 0;
            System.out.println("Оставшееся топливо " + fuelNow + "/" + fuel + "л");
        } else System.out.println("Недостаточно топлива, нужно заправиться");
    }

    @Override
    void honk() {

    }

    @Override
    void menu(Input input) {

    }

    @Override
    void refuel() {
        fuelNow = fuel;
        System.out.println("Вас отбуксировали до ближайшего порта. Вы заправились");
        System.out.println("Оставшееся топливо " + fuelNow + "/" + fuel + "л");
    }
}
