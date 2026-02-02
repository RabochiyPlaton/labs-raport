package labotory_11.vehicle;

import labotory_11.input.Input;

public class Car extends LandVehicle{

    private final int passengers;
    private int quantity;

    Car(int f, int c, int p) {
        super(f, c);
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
    void menu(Input input) {
        while (true) {
            System.out.println("\n1 - информация\n2 - Посигналить\n3 - Ехать\n4 - Заправиться\n5 - Взять пассажира\n6 - Высадить пассажира\n7 - Выход\n");
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
                    takePassenger();
                    break;
                case 6:
                    dropPassenger();
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
        System.out.println("Сигнал легкового автомобиля");
    }
}
