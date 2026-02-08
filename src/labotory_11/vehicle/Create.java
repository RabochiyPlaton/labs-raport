package labotory_11.vehicle;

import labotory_11.input.Input;

public class Create {
    public static Vehicle create(Input input) {
        System.out.println("Выберите вид транпортного средства:\n1 - Сухопутный\n2 - Морской\n3 - Воздушный");
        int inp = (int) input.inputPositiveNumber();
        System.out.print("Введите максимальный запас топлива: ");
        int fuel = (int) input.inputPositiveNumber();
        System.out.print("Введите расход топлива: ");
        int consumption = (int) input.inputPositiveNumber();
        switch (inp) {
            case 1:
                System.out.println("1 - пассажирский транспорт\n2 - грузовой транспорт");
                inp = (int) input.inputPositiveNumber();
                if (inp == 1) {
                    System.out.print("Введите количество пассажиров: ");
                    int passengers = (int) input.inputPositiveNumber();
                    return new Car(fuel, consumption, passengers);
                } else {
                    System.out.println("Введите грузоподъемность");
                    int carrying = (int) input.inputPositiveNumber();
                    return new Truck(fuel, consumption, carrying);
                }
            case 2:
                System.out.println("1 - корабль\n2 - подлодка");
                inp = (int) input.inputPositiveNumber();
                if (inp == 1) {
                    return new Ship(fuel, consumption);
                } else {
                    return new Submarine(fuel, consumption);
                }
            case 3:
                System.out.println("1 - самолет\n2 - вертолет");
                inp = (int) input.inputPositiveNumber();
                if (inp == 1) {
                    return new Airplane(fuel, consumption);
                } else {
                    return new Helicopter(fuel, consumption);
                }
            default:
                System.out.println("Нет такого варианта");
        }
        return null;
    }
}