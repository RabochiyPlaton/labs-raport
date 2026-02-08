package labotory_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Och och = CreateQueue.create(scanner);
            menu(scanner, och);
        }
    }

    static void menu(Scanner scanner, Och och) {
        char chPut, ch;
        int choice, size2;
        while (true) {
            System.out.println("\n1 - добавить элементы\n2 - извлечь элементы\n3 - распечатать весь массив\n4 - сбросить очередь\n5 - сохранить очередь\n6 - выход");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Вводите элементы (0 для выхода)");
                    boolean g = true;
                    while (g) {
                        chPut = scanner.nextLine().charAt(0);
                        if (chPut == '0') {
                            g = false;
                        } else {
                            och.put(chPut);
                        }
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Сколько символов надо извлечь?");
                    size2 = scanner.nextInt();
                    if (size2 > och.getLength()) size2 = och.getLength();
                    System.out.print("Извлечено: \n");
                    for (int i = 0; i < size2; i++) {
                        ch = och.get();
                        System.out.print(ch + " ");
                    }
                    break;
                case 3:
                    och.print();
                    break;
                case 4:
                    System.out.println("\nСброс очереди");
                    och.reset();
                    break;
                case 5:
                    System.out.println("\nСохранение очереди");
                    och = Och.save(och, scanner);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Нет такого варианта");
            }
        }
    }
}