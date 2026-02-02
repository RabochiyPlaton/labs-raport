package labotory_11.vehicle;

import labotory_11.input.Input;

public class Airplane extends AirVehicle{
    Airplane(int f, int c) {
        super(f, c);
    }

    @Override
    public String toString() {
        return "Самолет\nМаксимальный запас топлива = " + fuel + "\n" +
                "Расход топлива = " + consumption;
    }

    @Override
    void honk() {
        System.out.println("Радиосигнал самолета");
    }

    void deadPetlya(){
        System.out.println("Вы совершили мертвую петлю");
    }

    @Override
    void menu(Input input) {
        while (true) {
            System.out.println("\n1 - информация\n2 - Посигналить\n3 - Лететь\n4 - Заправиться\n5 - Мертвая петля\n6 - Выход\n");
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
                    deadPetlya();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Нет такого варианта, попробуйте снова");
            }
        }
    }
}
