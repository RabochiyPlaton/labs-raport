package labotory_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fuel;
        int consumption;
        int passengers;
        int carrying;
        int typeVehicle;
        while (true) {
            System.out.println("Выберите вид транпортного средства:\n1 - Пассажирский транспорт\n2 - Грузовой автомобиль\n3 - Выход");
            String input = scanner.nextLine().trim();
            if (input.length() != 1 || input.charAt(0) < '1' || input.charAt(0) > '3') {
                System.out.println("Некорректный ввод");
                continue;
            }
            typeVehicle = Integer.parseInt(input);
            switch (typeVehicle) {
                case 1:
                    System.out.println("Введите: максимальный запас топлива, расход топлива, кол-во пассажирских мест");
                    fuel = scanner.nextInt();
                    consumption = scanner.nextInt();
                    passengers = scanner.nextInt();
                    Car car = new Car(fuel, consumption, passengers);
                    car.menu(scanner);
                    break;
                case 2:
                    System.out.println("Введите: максимальный запас топлива, расход топлива, грузоподъемность");
                    fuel = scanner.nextInt();
                    consumption = scanner.nextInt();
                    carrying = scanner.nextInt();
                    Truck truck = new Truck(consumption, fuel, carrying);
                    truck.menu(scanner);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Нет такого варианта, попробуйте снова");
            }
        }
    }
}