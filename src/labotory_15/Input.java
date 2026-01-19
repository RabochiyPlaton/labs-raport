package labotory_15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private final Scanner scanner = new Scanner(System.in);

    public double inputPositiveNumber() {
        double x;
        while (true) {
            try {
                x = scanner.nextDouble();
                scanner.nextLine();
                if (x <= 0) {
                    System.out.println("Введите число > 0");
                    continue;
                }
                return x;
            }catch (InputMismatchException ex) {
                System.out.println("Введите число");
                scanner.nextLine();
            }
        }
    }

    public double inputAnyNumber() {
        double x;
        while (true) {
            try {
                x = scanner.nextDouble();
                scanner.nextLine();
                return x;
            }
            catch (InputMismatchException ex) {
                System.out.println("Введите число");
                scanner.nextLine();
            }
        }
    }

    public char inputChar() {
        char ch;
        while (true) {
            try {
                ch = scanner.nextLine().charAt(0);
                return ch;
            }catch (Throwable ex) {
                System.out.println("Некорректный ввод");
            }
        }
    }

    public double inputComplex() {
        double x;
        while (true) {
            try {
                x = scanner.nextDouble();
                scanner.nextLine();
                return (x + Math.sqrt(-1));
            }
            catch (InputMismatchException ex) {
                System.out.println("Введите число");
                scanner.nextLine();
            }
        }
    }
}
