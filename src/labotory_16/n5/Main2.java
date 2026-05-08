package labotory_16.n5;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        Fail fail = new Fail();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name1 = "C:\\Users\\Platon\\Desktop\\";
            String name2 = "C:\\Users\\Platon\\Desktop\\";
            System.out.println("1 - копировать из файла в файл\n2 - считать файл\n0 - выход");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите название файла ИЗ КОТОРОГО вы будете копировать");
                    name1 += scanner.nextLine();
                    name1 += ".txt";
                    System.out.println("Введите название файла КУДА вы будете копировать");
                    name2 += scanner.nextLine();
                    name2 += ".txt";
                    if (name1.equals(name2)) {
                        System.out.println("зачем копировать файл сам в себя");
                        break;
                    } else if (fail.isNotEmpty(name1)) {
                        System.out.println("файл пуст, нечего копировать");
                        break;
                    }
                    System.out.println("\nСодержание файла 1 (до копирования)");
                    fail.read(name1);
                    System.out.println("\nСодержание файла 2 (до копирования)");
                    fail.read(name2);
                    System.out.println();
                    fail.cop(name1, name2);
                    System.out.println("\nСодержание файла 1 (после копирования)");
                    fail.read(name1);
                    System.out.println("\nСодержание файла 2 (после копирования)");
                    fail.read(name2);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Введите название файла для чтения");
                    name1 += scanner.nextLine();
                    name1 += ".txt";
                    fail.read(name1);
                    break;
                case 0:
                    return;
            }
        }
    }
}
