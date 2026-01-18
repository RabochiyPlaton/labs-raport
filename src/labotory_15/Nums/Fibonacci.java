package labotory_15.Nums;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Введите количество чисел: ");
            try {
                n = scanner.nextInt();
                if (n <= 0) {
                    throw new NegativeNumberException("Число должно быть положительное");
                }
                int a = 0, b = 1;
                System.out.print("Последовательность Фибоначчи: ");
                for (int i = 1; i <= n; i++) {
                    System.out.print(a + " ");
                    int next = a + b;
                    a = b;
                    b = next;
                }
                System.out.println();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("\u001B[33mВведите  число\u001B[0m");
                scanner.nextLine();
            } catch (NegativeNumberException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
