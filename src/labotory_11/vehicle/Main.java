package labotory_11.vehicle;

import labotory_11.input.Input;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        int fuel;
        int consumption;
        int passengers;
        int carrying;
        while (true) {
            System.out.println("Выберите вид транпортного средства:\n1 - Пассажирский транспорт\n2 - Грузовой автомобиль\n3 - Выход");
            int inp = (int) input.input();
            switch (inp) {
                case 1:
                    System.out.println("Введите: максимальный запас топлива, расход топлива, кол-во пассажирских мест");
                    fuel = (int) input.input();
                    consumption = (int) input.input();
                    passengers = (int) input.input();
                    Car car = new Car(fuel, consumption, passengers);
                    car.menu(input);
                    break;
                case 2:
                    System.out.println("Введите: максимальный запас топлива, расход топлива, грузоподъемность");
                    fuel = (int) input.input();
                    consumption = (int) input.input();
                    carrying = (int) input.input();
                    Truck truck = new Truck(fuel ,consumption, carrying);
                    truck.menu(input);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Нет такого варианта, попробуйте снова");
            }
        }
    }
}