package labotory_16.n11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();
        while (true) {
            System.out.println("\n\n1 - Double\t2 - Int\t\n3 - Byte\t4 - Float\n5 - Short\t6 - Char\n0 - выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Использование PrintWriter для Double");
                    data.doublePW();
                    break;
                case 2:
                    System.out.println("Использование PrintWriter для Int");
                    data.intPW();
                    break;
                case 3:
                    System.out.println("Использование PrintWriter для Byte");
                    data.bytePW();
                    break;
                case 4:
                    System.out.println("Использование PrintWriter для Float");
                    data.floatPW();
                    break;
                case 5:
                    System.out.println("Использование PrintWriter для Short");
                    data.shortPW();
                    break;
                case 6:
                    System.out.println("Использование PrintWriter для Char");
                    data.charPW();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}
