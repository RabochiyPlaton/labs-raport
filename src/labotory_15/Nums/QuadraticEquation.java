package labotory_15.Nums;

import java.util.Scanner;
import java.util.InputMismatchException;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        while (true) {
            try {
                System.out.print("Введите коэффициент a (не 0): ");
                a = scanner.nextDouble();
                if (a == 0) {
                    System.out.println("\u001B[33mКоэффициент a не может быть 0\u001B[0m");
                    continue;
                }
                System.out.print("Введите коэффициент b: ");
                b = scanner.nextDouble();
                System.out.print("Введите коэффициент c: ");
                c = scanner.nextDouble();
                double discriminant = b * b - 4 * a * c;
                if (discriminant > 0) {
                    double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("x1 = " + x1 + ", x2 = " + x2);
                } else if (discriminant == 0) {
                    double x = -b / (2 * a);
                    System.out.println("x = " + x);
                } else {
                    System.out.println("Корней нет");
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("\u001B[33mВведите  число\u001B[0m");
                scanner.nextLine();
            }
        }
    }
}
