package labotory_16.n8;

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
                    data.doubleData();
                    break;
                case 2:
                    data.intData();
                    break;
                case 3:
                    data.byteData();
                    break;
                case 4:
                    data.floatData();
                    break;
                case 5:
                    data.shortData();
                    break;
                case 6:
                    data.charData();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}
