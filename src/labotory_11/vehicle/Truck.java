package labotory_11.vehicle;

import labotory_11.input.Input;


public class Truck extends Vehicle {

    private final int volume;
    private int goods = 0;

    Truck(int f, int c, int v) {
        super(f, c);
        volume = v;
    }

    public void takeGoods(Input input) {
        System.out.println("Сколько товара загрузить? Текущее количество: " + goods + "/" + volume);
        int quantity = (int) input.inputPositiveNumber();
        if (goods + quantity > volume) {
            System.out.println("Столько не влезет");
        } else {
            goods += quantity;
            System.out.println("Загружено: " + quantity + ". Текущее количество: " + goods + "/" + volume);
        }
    }

    public void dropGoods(Input input) {
        if (goods == 0) {
            System.out.println("Грузовик уже пуст");
            return;
        }
        System.out.println("Сколько товара выгрузить? Текущее количество: " + goods + "/" + volume);
        int amount = (int) input.inputPositiveNumber();
        if (amount > goods) {
            System.out.println("Нельзя выгрузить больше, чем есть. Выгружено всё.");
            goods = 0;
        } else {
            goods -= amount;
            System.out.println("Выгружено: " + amount + ". Текущее количество: " + goods + "/" + volume);
        }
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль\nМаксимальный запас топлива = " + fuel + "\n" +
                "Расход топлива = " + consumption + "\nМаксимальный объём перевозимого груза = " + volume;
    }

    @Override
    void menu(Input input) {
        while (true) {
            System.out.println("\n1 - информация\n2 - Посигналить\n3 - Ехать\n4 - Заправиться\n5 - Загрузить товары\n6 - Выгрузить товары\n7 - Выход\n");
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
                    takeGoods(input);
                    break;
                case 6:
                    dropGoods(input);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Нет такого варианта, попробуйте снова");
            }
        }
    }

    @Override
    public void honk() {
        System.out.println("Сигнал грузовика");
    }
}
