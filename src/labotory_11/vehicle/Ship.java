package labotory_11.vehicle;

import labotory_11.input.Input;

public class Ship extends WaterVehicle{

    private boolean isAnchored = false;

    Ship(int f, int c) {
        super(f, c);
    }

    @Override
    public String toString() {
        return "Корабль\nМаксимальный запас топлива = " + fuel + "\n" +
                "Расход топлива = " + consumption;
    }

    @Override
    void honk() {
        System.out.println("Гудок корабля");
    }

    @Override
    void move() {
        if (isAnchored = false) {
            System.out.println("Вы на якоре, движение невозможно");
        }
        else if (fuelNow >= consumption) {
            System.out.println("Вы проплыли 500 км");
            fuelNow -= consumption;
            if (fuelNow < 0) fuelNow = 0;
            System.out.println("Оставшееся топливо " + fuelNow + "/" + fuel + "л");
        } else System.out.println("Недостаточно топлива, нужно заправиться");
    }

    void putAnchor(){
        System.out.println("Вы бросили якорь");
        isAnchored = true;
    }

    void getAnchor(){
        System.out.println("Вы подняли якорь, можно плыть");
    }

    @Override
    void menu(Input input) {
        while (true) {
            System.out.println("\n1 - информация\n2 - Посигналить\n3 - Плыть\n4 - Заправиться\n5 - Кинуть якорь\n6 - Поднять якорь\n7 - Выход\n");
            int inp = (int) input.inputPositiveNumber();
            switch (inp) {
                case 1:
                    System.out.println(this);
                    break;
                case 2:
                    honk();
                    break;
                case 3:
                    move();
                    break;
                case 4:
                    refuel();
                    break;
                case 5:
                    putAnchor();
                    break;
                case 6:
                    getAnchor();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Нет такого варианта, попробуйте снова");
            }
        }
    }
}
