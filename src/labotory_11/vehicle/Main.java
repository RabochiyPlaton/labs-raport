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
            int inp = (int) input.inputPositiveNumber();
            switch (inp) {
                case 1:
                    System.out.println("Введите: максимальный запас топлива, расход топлива, кол-во пассажирских мест");
                    fuel = (int) input.inputPositiveNumber();
                    consumption = (int) input.inputPositiveNumber();
                    passengers = (int) input.inputPositiveNumber();
                    Car car = new Car(fuel, consumption, passengers);
                    car.menu(input);
                    break;
                case 2:
                    System.out.println("Введите: максимальный запас топлива, расход топлива, грузоподъемность");
                    fuel = (int) input.inputPositiveNumber();
                    consumption = (int) input.inputPositiveNumber();
                    carrying = (int) input.inputPositiveNumber();
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