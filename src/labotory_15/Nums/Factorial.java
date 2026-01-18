package labotory_15.Nums;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Введите положительное число: ");
            try {
                n = scanner.nextInt();
                if (n < 0) {
                    throw new NegativeNumberException("Число должно быть положительное");
                }
                if (n > 12) {
                    throw new FactorialOverflowException("Максимально допустимое число для расчета факториала int - 12");
                }
                int fact = 1;
                for (int i = 2; i <= n; i++) {
                    fact *= i;
                }
                System.out.println("Факториал числа " + n + " = " + fact);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("\u001B[33mВведите  число\u001B[0m");
            } catch (NegativeNumberException | FactorialOverflowException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
