package labotory_11.vehicle;

import labotory_11.input.Input;

public class Helicopter extends AirVehicle{

    Helicopter(int f, int c) {
        super(f, c);
    }

    @Override
    void move() {

    }

    @Override
    void honk() {
        System.out.println("Радиосигнал вертолета");
    }

    @Override
    public String toString() {
        return "Вертолет\nМаксимальный запас топлива = " + fuel + "\n" +
                "Расход топлива = " + consumption;
    }

    void stayInAir() {
        System.out.println("Вы зависли в воздухе");
    }

    @Override
    void menu(Input input) {
        while (true) {
            System.out.println("\n1 - информация\n2 - Посигналить\n3 - Лететь\n4 - Заправиться\n5 - Зависнуть в воздухе\n6 - Выход\n");
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
                    stayInAir();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Нет такого варианта, попробуйте снова");
            }
        }
    }
}
