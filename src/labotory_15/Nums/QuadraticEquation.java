package labotory_15.Nums;

import labotory_15.Input;

public class QuadraticEquation {
    public static void main(String[] args) {
        Input input = new Input();
        double a, b, c;
        while (true) {
            System.out.print("Введите коэффициент: ");
            a = input.inputPositiveNumber();
            if (a == 0) {
                System.out.println("\u001B[33mКоэффициент a не может быть 0\u001B[0m");
                continue;
            }
            System.out.print("Введите коэффициент b: ");
            b = input.inputAnyNumber();
            System.out.print("Введите коэффициент c: ");
            c = input.inputAnyNumber();
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
        }
    }
}
