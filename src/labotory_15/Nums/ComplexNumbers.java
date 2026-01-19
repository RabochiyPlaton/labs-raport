package labotory_15.Nums;

import labotory_15.Input;

public class ComplexNumbers {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Комплексные числа");
        System.out.println("Введите первое число: ");
        double num1 = input.inputComplex();
        System.out.println("num1 = " + num1);
        System.out.println("Введите второе число: ");
        double num2 = input.inputComplex();
        System.out.println("num2 = " + num2);
        while (true) {
            System.out.println("1 - сложить\n2 - перемножить\n3 - выход");
            int choice = (int) input.inputAnyNumber();
            switch (choice) {
                case 1:
                    plus(num1, num2);
                    break;
                case 2:
                    multiplication(num1, num2);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }

    static void plus(double num1, double num2) {
        try {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } catch (ArithmeticException ex) {
            System.out.println("Невозможно вычислить");
        }
    }

    static void multiplication(double num1, double num2) {
        try {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } catch (ArithmeticException ex) {
            System.out.println("Невозможно вычислить");
        }
    }
}
