package labotory_11;

import java.util.Scanner;

public class Truck extends Vehicle {

    private final int volume;
    private int goods = 0;

    Truck(int c, int f, int v) {
        super(c, f);
        volume = v;
    }

    public void takeGoods() {
        if (goods >= volume) {
            goods = volume;
            System.out.println("Нет свободного места");
        } else {
            goods += 10;
            System.out.println("Текущее количество " + goods + "/" + volume);
        }
    }

    public void dropGoods() {
        if (goods == 0) System.out.println("Есть свободное место");
        else {
            goods = 0;
            System.out.println("Товар разгружен");
            System.out.println("Текущее количество " + goods + "/" + volume);
        }
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль\nМаксимальный запас топлива = " + fuel + "\n" +
                "Расход топлива = " + consumption + "\nМаксимальный объём перевозимого груза = " + volume;
    }

    @Override
    void menu(Scanner scanner) {
        while (true) {
            System.out.println("\n0 - информация\n1 - Посигналить\n2 - Ехать\n3 - Заправиться\n4 - Загрузить товары\n5 - Выгрузить товары\n6 - Выход\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println(this);
                    break;
                case 1:
                    honk();
                    break;
                case 2:
                    move();
                    break;
                case 3:
                    refuel();
                    break;
                case 4:
                    takeGoods();
                    break;
                case 5:
                    dropGoods();
                    break;
                case 6:
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
