package labotory_11;

import java.util.Scanner;

public class Car extends Vehicle {

    private final int passengers;
    private int quantity;

    Car(int f, int c, int p) {
        super(c, f);
        passengers = p;
    }

    public void takePassenger() {
        if (quantity == passengers) System.out.println("Нет свободных мест");
        else {
            quantity++;
            System.out.println("Новый пассажир (текущее количество " + quantity + ")");
        }
    }

    public void dropPassenger() {
        if (quantity == 0) System.out.println("Салон уже пуст");
        else {
            quantity--;
            System.out.println("Вы высадили пассажира (текущее количество " + quantity + ")");
        }
    }

    @Override
    public String toString() {
        return "Пассажирский транспорт\nМаксимальный запас топлива = " + fuel + "\n" +
                "Расход топлива = " + consumption + "\nКоличество пассажирских мест = " + passengers;
    }

    @Override
    void menu(Scanner scanner) {
        int choice;
        while (true) {
            System.out.println("\n0 - информация\n1 - Посигналить\n2 - Ехать\n3 - Заправиться\n4 - Взять пассажира\n5 - Высадить пассажира\n6 - Выход\n");
            String input = scanner.nextLine().trim();
            if (input.length() != 1 || input.charAt(0) < '1' || input.charAt(0) > '9') {
                System.out.println("Некорректный ввод");
                continue;
            }
            choice = Integer.parseInt(input);
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
                    takePassenger();
                    break;
                case 5:
                    dropPassenger();
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
        System.out.println("Сигнал легкового автомобиля");
    }
}
