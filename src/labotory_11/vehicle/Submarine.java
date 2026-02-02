package labotory_11.vehicle;

import labotory_11.input.Input;

public class Submarine extends WaterVehicle{
    Submarine(int f, int c) {
        super(f, c);
    }

    @Override
    public String toString() {
        return "Субмарина\nМаксимальный запас топлива = " + fuel + "\n" +
                "Расход топлива = " + consumption;
    }

    @Override
    void honk() {
        System.out.println("Радиосигнал субмарины");
    }

    void toUnderWater() {
        System.out.println("Вы погрузились на морское дно");
    }

    void toUpWater() {
        System.out.println("Вы всплыли на поверхность");
    }

    @Override
    void menu(Input input) {
        while (true) {
            System.out.println("\n1 - информация\n2 - Посигналить\n3 - Ехать\n4 - Заправиться\n5 - Погрузиться\n6 - Всплыть\n7 - Выход\n");
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
                    toUnderWater();
                    break;
                case 6:
                    toUpWater();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Нет такого варианта, попробуйте снова");
            }
        }
    }
}
