package labotory_15.Nums;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int int1, int2;
        while (true) {
            try {
                System.out.println("Введите строку:");
                str = scanner.nextLine();
                if (str.isEmpty()) {
                    throw new EmptyStrException("Строка не должна быть пустой");
                }
                break;
            } catch (EmptyStrException ex) {
                System.out.println(ex.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Введите первое число (int): ");
                int1 = scanner.nextInt();
                scanner.nextLine();
                if (int1 <= 0) {
                    throw new NegativeNumberException("Число должно быть больше нуля");
                }
                break;
            } catch (NegativeNumberException ex) {
                System.out.println(ex.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Введите второе число (int): ");
                int2 = scanner.nextInt();
                scanner.nextLine();
                if (int2 <= 0) {
                    throw new NegativeNumberException("Число должно быть больше нуля");
                }
                break;
            } catch (NegativeNumberException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(str.substring(int1, int2));
    }
}
