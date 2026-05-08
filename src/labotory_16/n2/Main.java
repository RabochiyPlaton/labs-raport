package labotory_16.n2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        byte[] data = new byte[size];
        while (true) {
            System.out.println("\nМеню: ");
            System.out.println("1 - Ввод");
            System.out.println("2 - Вывод");
            System.out.println("3 - Выход\n");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите несколько символов");
                    System.in.read(data);
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.write(data);
                    break;
                default:
                    return;
            }
        }
    }
}
